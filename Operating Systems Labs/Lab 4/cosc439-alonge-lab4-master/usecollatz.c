#include <stdio.h>
#include <sys/types.h>
#include<unistd.h>

int main(int argc, char *argv[]){
	int n = 5;
	int output;
	
	printf("Enter a number between 1-100");
	
	fork();
	execl("/bin/ls/collatz.c", "n", "-1", NULL);
	
	printf("You entered: %d", n);
	
	printf("\n%d", n);
	
	while(n>1){
	
	if(n%2 == 0){
		output = n/2;
	}else{
		output = (3*n)+1;
	}
	n = output;
	printf("\n%d", output);
	}
	printf("\nEND");
}

