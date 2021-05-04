#include <stdio.h>
#include <sys/types.h>
#include<unistd.h>

int main(int argc, char *argv[]){
	int n = 5;
	int output;
	fork();
	printf("START");
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

