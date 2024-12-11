// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2e.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

 int main( ) 
{ 
    pid_t pid; 
    int i=5; 
    pid=fork(); 
    if(pid==0) 
    { 
        i=i+1; 
        printf("Child: %d",i); 
    } 
    else 
    { 
        wait(NULL); 
        printf("Parent: %d",i); 
    } 
    return 0; 
} 