// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2m.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main( ) 
{ 
    int i=5; 
    fork(); 
    i=i+1; 
    fork(); 
    printf ( "% d",i); 
    return 0; 
} 