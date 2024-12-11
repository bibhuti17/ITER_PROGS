// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2j.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main( ) 
{ 
     if(vfork( )==0) 
     { 
          printf("1"); 
          _exit(0); 
     } 
     else 
     { 
          printf("2"); 
          printf("3"); 
     } 
     return 0; 
}