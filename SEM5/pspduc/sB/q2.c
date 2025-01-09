#include <stdio.h>

int main() {
    int id, projects;
    double project_rate, gross_earnings, net_pay, total_payroll = 0.0;
    int worker_count = 0;

    while (1) {
        printf("Enter worker ID (negative to end): ");
        scanf("%d", &id);
        if (id < 0) break;

        printf("Enter project rate: ");
        scanf("%lf", &project_rate);
        
        printf("Enter number of projects completed: ");
        scanf("%d", &projects);

        gross_earnings = project_rate * projects;
        if (projects > 5) {
            gross_earnings += (projects - 5) * project_rate * 0.20;
        }
        
        net_pay = gross_earnings * 0.93;
        
        printf("Worker ID: %d, Net Pay: %.2f\n", id, net_pay);
        
        total_payroll += net_pay;
        worker_count++;
    }

    if (worker_count > 0) {
        printf("Total Payroll: %.2f\n", total_payroll);
        printf("Average Payment: %.2f\n", total_payroll / worker_count);
    } else {
        printf("No workers processed.\n");
    }

    return 0;
}
