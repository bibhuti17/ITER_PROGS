#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int day;
    int month;
    int year;
} date_t;

typedef struct {
    float capacity;
    float current_level;
} tank_t;

typedef struct {
    char make[50];
    char model[50];
    int odometer;
    date_t manufacture_date;
    date_t purchase_date;
    tank_t gas_tank;
} auto_t;

void scan_date(date_t *d) {
    scanf("%d %d %d", &d->day, &d->month, &d->year);
}

void scan_tank(tank_t *t) {
    scanf("%f %f", &t->capacity, &t->current_level);
}

void scan_auto(auto_t *a) {
    scanf("%s %s %d", a->make, a->model, &a->odometer);
    scan_date(&a->manufacture_date);
    scan_date(&a->purchase_date);
    scan_tank(&a->gas_tank);
}

void print_date(date_t d) {
    printf("%02d/%02d/%04d ", d.day, d.month, d.year);
}

void print_tank(tank_t t) {
    printf("Capacity: %.2f gallons, Current Level: %.2f gallons\n", t.capacity, t.current_level);
}

void print_auto(auto_t a) {
    printf("Make: %s, Model: %s, Odometer: %d\n", a.make, a.model, a.odometer);
    printf("Manufacture Date: ");
    print_date(a.manufacture_date);
    printf("Purchase Date: ");
    print_date(a.purchase_date);
    print_tank(a.gas_tank);
}

int main() {
    auto_t autos[2];

    for (int i = 0; i < 2; i++) {
        scan_auto(&autos[i]);
    }

    for (int i = 0; i < 2; i++) {
        print_auto(autos[i]);
        printf("\n");
    }

    return 0;
}
