obj-m += tessler_drive.o

KDIR:= /usr/src/linux-headers-5.4.0-54-generic

tessler_drive:
	$(MAKE) -C $(KDIR) M=$(shell pwd) modules
	
clean:
	make -C /lib/modules/$(shell uname -r)/build M=$(PWD) clean

