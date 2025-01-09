#include <stdio.h>
#include <string.h>

void pluralize(char noun[], char plural[]) {
    int len = strlen(noun);
    if (noun[len - 1] == 'y' && len > 1 && !(noun[len - 2] == 'a' || noun[len - 2] == 'e' || noun[len - 2] == 'i' || noun[len - 2] == 'o' || noun[len - 2] == 'u')) {
        strncpy(plural, noun, len - 1);
        plural[len - 1] = '\0';
        strcat(plural, "ies");
    } else if (noun[len - 1] == 's' || (len >= 2 && (noun[len - 2] == 'c' && noun[len - 1] == 'h')) || (len >= 2 && (noun[len - 2] == 's' && noun[len - 1] == 'h'))) {
        strcpy(plural, noun);
        strcat(plural, "es");
    } else {
        strcpy(plural, noun);
        strcat(plural, "s");
    }
}

int main() {
    char nouns[][20] = {"Chair", "dairy", "Boss", "circus", "fly", "Dog", "church", "clue", "dish"};
    char plural[30];
    printf("Noun\t\tPlural Form\n");
    printf("----------------------------\n");
    
    for (int i = 0; i < sizeof(nouns) / sizeof(nouns[0]); i++) {
        pluralize(nouns[i], plural);
        printf("%s\t\t%s\n", nouns[i], plural);
    }

    return 0;
}
