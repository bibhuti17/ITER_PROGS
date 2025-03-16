#include <stdio.h>
#include <string.h>

void salting(char password[]) {
    char salt[] = "121";
    char newPswd[200];

    strcpy(newPswd, password);
    strcat(newPswd, salt);
    
    // printf("%s", newPswd);
    puts(newPswd);
}
int main() {
    char password[100];
    scanf("%s", &password);
    salting(password);
}