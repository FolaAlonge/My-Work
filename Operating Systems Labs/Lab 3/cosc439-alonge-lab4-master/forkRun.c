#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

int
main(int argc, char** arg){
printf("Before fork()\n");
fork();
printf("After fork()\n");
return 0;
}
