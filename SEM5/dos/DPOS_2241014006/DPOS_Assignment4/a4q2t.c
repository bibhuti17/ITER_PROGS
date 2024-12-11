// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2a.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>


void fun1(){ 
    fork(); 
    fork(); 
    printf("1\n"); 
} 
          
int main() 
{ 
    fun1(); 
    printf("1\n"); 
    return 0; 
} 