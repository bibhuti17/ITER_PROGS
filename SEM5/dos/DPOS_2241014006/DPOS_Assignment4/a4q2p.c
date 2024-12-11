// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2p.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
int main() 
{ 
    int i=5; 
    if(vfork()==0) 
    {  
        i=i+1; 
        _exit(0); 
    } 
    else 
        i=i-1; 
        fprintf(stderr,"%d",i); 
    return 0; 
} 