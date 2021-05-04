#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

int worker(int a){
printf("\nHello World!I am thread %d", a);
int pthread_create(pthread_t * thread, const pthread_attr_t * attr, void * (*start_routine)(void *), void *arg);
return 0;
}

int main(int argc, char *argv[])
{
int i, id = 0, count = atoi(argv[1]);
    
    if(count < 11 && count > 1){
   for (i = 1; i <= count; i++){
    	 id=i;
    	 printf("\nCreating thread %d", id);
    	worker(id);
    }
    } else {
        printf("\nERROR: n is outside the bounds of 1-10\n");
    }
    
    return 0;
}
