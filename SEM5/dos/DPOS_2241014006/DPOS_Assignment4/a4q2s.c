// binarybibhu@B-Dock:~/DPOS_2241014006/DPOS_Assignment4$ code a4q2s.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

 int main() 
{ 
    if(fork() == 0) 
        if(fork()) 
            printf("1\n"); 
    return 0; 
} 