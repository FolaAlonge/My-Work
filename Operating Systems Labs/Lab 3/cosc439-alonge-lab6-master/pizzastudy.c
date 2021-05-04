#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>

int *slices;
static pthread_mutex_t pizza = PTHREAD_MUTEX_INITIALIZER;

int eatSlice(int slices){
pthread_mutex_lock(&pizza);
slices--;
pthread_mutex_unlock(&pizza);
return slices;
}

int orderPizza(int slices, int pizzas){
pthread_mutex_lock(&pizza);
slices += 8;
pthread_mutex_unlock(&pizza);
printf("\nPizza %d", pizzas);
printf(" is delivered!");

return slices;
}

int createStudent(int a){
printf("\nStudent # %d", a);
printf(" joined the session.");
int pthread_create(pthread_t * thread, const pthread_attr_t * attr, void * (*start_routine)(void *), void *arg);
return 0;
}

int study(int slices, int pizza, int i){
if(slices > 0){
eatslice(slices);
}else if(slices == 0){
if(i == 1){
orderPizza(slices, pizza);
}else if(slices == 0){
nap();
}

}
}

int main(int argc, char *argv[])
{
int students = atoi(argv[1]), id, i;

   for (i = 1; i <= students; i++){
    	 id=i;
    	createStudent(id);
    }
    
return 0;
}
