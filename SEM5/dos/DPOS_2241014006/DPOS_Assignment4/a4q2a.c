// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2a.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main( ) 
{ 
  if(fork()==0) 
    printf("1"); 
  else 
    printf("2"); 
  printf("3"); 
  return 0; 
} 

