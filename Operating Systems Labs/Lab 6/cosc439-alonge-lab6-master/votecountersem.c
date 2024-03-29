#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

int votes = 0;
sem_t sem;

void *countvotes(void *param){
int i;

for (i=0; i<10000000; i++){
sem_wait(&sem);
 votes += 1;
sem_post(&sem);
}
return NULL;
}

int main(){
	sem_init(&sem, 0, 1);
	pthread_t tid1, tid2, tid3, tid4, tid5;
	
	pthread_create(&tid1, NULL, countvotes, NULL);
	pthread_create(&tid2, NULL, countvotes, NULL);
	pthread_create(&tid3, NULL, countvotes, NULL);
	pthread_create(&tid4, NULL, countvotes, NULL);
	pthread_create(&tid5, NULL, countvotes, NULL);
	
	pthread_join(tid1, NULL);
	pthread_join(tid2, NULL);
	pthread_join(tid3, NULL);
	pthread_join(tid4, NULL);
	pthread_join(tid5, NULL);

	printf("Vote total: %d\n", votes);
	sem_destroy(&sem);
return 0;
}
