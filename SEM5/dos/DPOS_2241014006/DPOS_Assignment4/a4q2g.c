// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2g.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main( ) 
{ 
     int i=5; 
     if(fork( )==0) 
     { 
          printf("Child: %d",i); 
     } 
     else 
     { 
          printf("Parent: %d",i); 
     } 
     return 0; 
} 