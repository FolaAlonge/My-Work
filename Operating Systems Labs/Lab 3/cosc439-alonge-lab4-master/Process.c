#include <stdio.h>
#include <sys/types.h>
#include<unistd.h>

void childprocess();
void parenetprocess();

int main(int argc, char** argv) {
	pid_t pid;
	pid = fork();

	if (pid == 0){
		childprocess();
	}else {
		parentprocess();
	]
	return 0;
}
void childprocess(){

}
void parentprocess(){
printf("START\n");
fork();

}
