#include <stdio.h>

#define ELEM_NAME 50
#define ELEM_CLASS 30
#define ELECT 7

typedef struct {
    int atom_num;
    char name[ELEM_NAME];
    char symbol[3];
    char class_of_metal[ELEM_CLASS];
    double atomic_weight;
    int electrons[ELECT];
} element_t;

void scan_element(element_t *elem) {
    scanf("%d", &elem->atom_num);
    scanf("%s", elem->name);
    scanf("%s", elem->symbol);
    scanf("%s", elem->class_of_metal);
    scanf("%lf", &elem->atomic_weight);
    for (int i = 0; i < ELECT; i++) {
        scanf("%d", &elem->electrons[i]);
    }
}

void print_element(element_t elem) {
    printf("Atomic Number: %d\n", elem.atom_num);
    printf("Name: %s\n", elem.name);
    printf("Symbol: %s\n", elem.symbol);
    printf("Class: %s\n", elem.class_of_metal);
    printf("Atomic Weight: %.4f\n", elem.atomic_weight);
    printf("Electrons in Shells: ");
    for (int i = 0; i < ELECT; i++) {
        printf("%d ", elem.electrons[i]);
    }
    printf("\n");
}

int main() {
    element_t sodium;
    
    printf("Enter details for the element (atomic number, name, symbol, class, atomic weight, electrons in shells):\n");
    scan_element(&sodium);
    
    print_element(sodium);
    
    return 0;
}
