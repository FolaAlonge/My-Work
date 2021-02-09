#include <linux/init.h>
#include <linux/module.h>
#include <linux/usb.h>
#include <linux/kernel.h>

MODULE_LICENSE("GPL");
MODULE_AUTHOR("CFL");
MODULE_DESCRIPTION("USB Driver for Dr.Tessler");

static struct usb_device *device;

//disconnected usb
static void tess_disconnect(struct usb_interface *interface){
printk(KERN_INFO "Tessler driver %d has disconnected.\n", interface->cur_altsetting->desc.bInterfaceNumber);
}

/*probe function
source: Greg Kroah-Hartman
link: https://www.kernel.org/doc/html/latest/driver-api/usb/writing_usb_driver.html*/
static int tess_probe(struct usb_interface *interface, const struct usb_device_id *id)
{
  int i;
  struct usb_host_interface *iface_desc;
  struct usb_endpoint_descriptor *endpoint;
  
  iface_desc = interface->cur_altsetting;
  
  printk(KERN_INFO "Tessler USB Drive (%04X:%04X) is plugged in...\n", id->idVendor, id->idProduct); 
  
  printk(KERN_INFO "ID->bNumEndpoints: %02X\n", iface_desc->desc.bNumEndpoints);
  
  printk(KERN_INFO "ID->bInterfaceClass: %02X\n", iface_desc->desc.bInterfaceClass);
  
  for(i = 0; i < iface_desc->desc.bNumEndpoints; i++)
  {
  	endpoint = &iface_desc->endpoint[i].desc;
  	
  	printk(KERN_INFO "ED[%d]->bEndpointAddress: 0x%02X\n", i, endpoint->bEndpointAddress);
  	
  	printk(KERN_INFO "ED[%d]->bmAttributes: 0x%02X\n", i, endpoint->bmAttributes);
  	
  	printk(KERN_INFO "ED[%d]->wMaxPacketSize: 0x%04X (%d)\n", i, endpoint->wMaxPacketSize, endpoint->wMaxPacketSize);
  }
  device = interface_to_usbdev(interface);
  return 0;
  
}
  // device id table
static struct usb_device_id tess_table[] = {
	{USB_DEVICE(0x154b, 0x00c4)},
	{ } //tells kernel which device to use
};
MODULE_DEVICE_TABLE(usb, tess_table);
// device driver
static struct usb_driver pen_driver = 
{
	.name = "TesslerDrive-USB Driver",
	.id_table   = tess_table,
	.probe      = tess_probe,
	.disconnect = tess_disconnect,
};
//device initiallization
static int __init tessler_drive_init(void)
{
	
	int result;
	result = usb_register(&pen_driver);
	if(result < 0)
	{
		printk("usb_register failed for the tessler driver. Error number %d/n", result);
		return -1;
	}
	return 0;
} 
module_init(tessler_drive_init);

static void __exit tessler_drive_exit(void)
{
	usb_deregister(&pen_driver);
} 
module_exit(tessler_drive_exit);



/*
static ssize_t tess_write(struct file *f, const char __user *buf, size_t loff_t *off)
  {
  int write_cnt = MIN(cnt, MAX_PKT_SIZE);
  ++tess->open_count;
  file->private_data = dev;
  bytes_written = (count > skel->bulk_out_size)? skel->bulk_out_size : count;
  
  copy_from_user(skel->write_urb->transfer_buffer, buffer, bytes_written);
  usb_fill_bulk_urb(tess->write_urb;
  		     tess->dev,
  		     usb_sndbulkpipe(skel->dev, skel->bulk_out_endpointAddr),
  		     skel->write_urb->transfer_buffer,
  		     bytes_written,
  		     skel_write_bulk_callback,
  		     skel);
  		     
  int result = usb_submit_urb(urb, GFP_KERNEL);
  if(result)
  {
  	printk(KERN_ERR "Failed submitting write urb, eror %d\n", result);
  	return result;
  }
  return write_cnt;
  
  //read
static ssize_t tess_read(struct file *f, char __user *buf, size_t cnt,)
{
	int result;
	int count;
	
	result = usb_bulk_msg (tess->device, usb_rcvbulkpipe(skel->dev, skel->bulk_in_endpointAddr), skel->bulk_in_size, &count, HZ*10);
	
	if(!result)
	{
		if(copy_to_user (buffer, skel->bulk_in_buffer, count))
			result = -EFAULT;
		else
			result = count;
	}
}
 }
*/

