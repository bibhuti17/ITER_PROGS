#include <stdio.h>
#include <stdlib.h>
// Structure to represent a process
struct Process
{
    int pid;        // Process ID
    int arrival;    // Arrival Time
    int burst;      // Burst Time
    int waiting;    // Waiting Time
    int turnaround; // Turnaround Time
    int remaining;  // Remaining Burst Time (for RR)
};
// Function to calculate FCFS Scheduling
void fcfs(struct Process processes[], int n)
{
    int current_time = 0;
    float total_waiting = 0, total_turnaround = 0;
    printf("\nGantt Chart (FCFS):\n");
    for (int i = 0; i < n; i++)
    {
        if (current_time < processes[i].arrival)
            current_time = processes[i].arrival;
        printf("| P%d (%d-%d) ", processes[i].pid, current_time, current_time + processes[i].burst);
        current_time += processes[i].burst;
        processes[i].turnaround = current_time - processes[i].arrival;
        processes[i].waiting = processes[i].turnaround - processes[i].burst;
        total_turnaround += processes[i].turnaround;
        total_waiting += processes[i].waiting;
    }
    printf("|\n");
    printf("\nAverage Turnaround Time: %.2f ms\n", total_turnaround / n);
    printf("Average Waiting Time: %.2f ms\n", total_waiting / n);
}
// Function to calculate Round Robin Scheduling
void round_robin(struct Process processes[], int n, int quantum)
{
    int current_time = 0, remaining = n;
    float total_waiting = 0, total_turnaround = 0;
    printf("\nGantt Chart (Round Robin):\n");
    while (remaining > 0)
    {
        for (int i = 0; i < n; i++)
        {
            if (processes[i].remaining > 0 && processes[i].arrival <= current_time)
            {
                printf("| P%d (%d-", processes[i].pid, current_time);
                if (processes[i].remaining <= quantum)
                {
                    current_time += processes[i].remaining;
                    processes[i].remaining = 0;
                    processes[i].turnaround = current_time - processes[i].arrival;
                    processes[i].waiting = processes[i].turnaround - processes[i].burst;
                    remaining--;
                }
                else
                {
                    current_time += quantum;
                    processes[i].remaining -= quantum;
                }
                printf("%d) ", current_time);
            }
        }
    }
    printf("|\n");
    for (int i = 0; i < n; i++)
    {
        total_turnaround += processes[i].turnaround;
        total_waiting += processes[i].waiting;
    }
    printf("\nAverage Turnaround Time: %.2f ms\n", total_turnaround / n);
    printf("Average Waiting Time: %.2f ms\n", total_waiting / n);
}
int main()
{
    int n, choice, quantum;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    struct Process processes[n];
    printf("\nEnter process details (Arrival Time and Burst Time):\n");
    for (int i = 0; i < n; i++)
    {
        processes[i].pid = i + 1;
        printf("Process P%d:\n", processes[i].pid);
        printf("Arrival Time: ");
        scanf("%d", &processes[i].arrival);
        printf("Burst Time: ");
        scanf("%d", &processes[i].burst);
        processes[i].remaining = processes[i].burst; // Initialize remaining time for RR
    }
    do
    {
        printf("\nMenu:\n");
        printf("1. First Come First Serve (FCFS)\n");
        printf("2. Round Robin (RR)\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            fcfs(processes, n);
            break;
        case 2:
            printf("Enter the time quantum: ");
            scanf("%d", &quantum);
            round_robin(processes, n, quantum);
            break;
        case 3:
            printf("Exiting program.\n");
            break;
        default:
            printf("Invalid choice!\n");
        }
    } while (choice != 3);
    return 0;
}