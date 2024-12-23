#include <stdio.h>
#include <stdbool.h>
#define P 5 
#define R 4 

void calculateNeed(int need[P][R], int max[P][R], int allocation[P][R])
{
    for (int i = 0; i < P; i++)
    {
        for (int j = 0; j < R; j++)
        {
            need[i][j] = max[i][j] - allocation[i][j];
        }
    }
}

bool isSafe(int processes[], int available[], int max[P][R], int allocation[P][R])
{
    int need[P][R];
    calculateNeed(need, max, allocation);
    bool finished[P] = {false};
    int safeSequence[P];
    int work[R];
    for (int i = 0; i < R; i++)
    {
        work[i] = available[i];
    }
    int count = 0;
    while (count < P)
    {
        bool found = false;
        for (int i = 0; i < P; i++)
        {
            if (!finished[i])
            {
                bool canAllocate = true;
                for (int j = 0; j < R; j++)
                {
                    if (need[i][j] > work[j])
                    {
                        canAllocate = false;
                        break;
                    }
                }
                if (canAllocate)
                {
                    for (int j = 0; j < R; j++)
                    {
                        work[j] += allocation[i][j];
                    }
                    safeSequence[count++] = i;
                    finished[i] = true;
                    found = true;
                }
            }
        }
        if (!found)
        {
            printf("System is not in a safe state.\n");
            return false;
        }
    }
    printf("System is in a safe state. Safe sequence: ");
    for (int i = 0; i < P; i++)
    {
        printf("P%d ", safeSequence[i]);
    }
    printf("\n");
    return true;
}
// Function to request resources for a process
bool requestResources(int process, int request[], int available[], int max[P][R], int allocation[P][R])
{
    int need[P][R];
    calculateNeed(need, max, allocation);
    for (int i = 0; i < R; i++)
    {
        if (request[i] > need[process][i])
        {
            printf("Error: Request exceeds maximum need.\n");
            return false;
        }
        if (request[i] > available[i])
        {
            printf("Error: Resources not available.\n");
            return false;
        }
    }
    for (int i = 0; i < R; i++)
    {
        available[i] -= request[i];
        allocation[process][i] += request[i];
    }
    if (isSafe((int[]){0, 1, 2, 3, 4}, available, max, allocation))
    {
        printf("Request granted.\n");
        return true;
    }
    else
    {
        for (int i = 0; i < R; i++)
        {
            available[i] += request[i];
            allocation[process][i] -= request[i];
        }
        printf("Request denied to maintain safety.\n");
        return false;
    }
}
int main()
{
    int processes[] = {0, 1, 2, 3, 4};
    int available[R] = {6, 7, 12, 12};
    int max[P][R] = {
        {0, 0, 1, 2},
        {2, 7, 5, 0},
        {6, 6, 5, 6},
        {4, 3, 5, 6},
        {0, 6, 5, 2}};
    int allocation[P][R] = {
        {0, 0, 1, 2},
        {2, 0, 0, 0},
        {0, 0, 3, 4},
        {2, 3, 5, 4},
        {0, 3, 3, 2}};
    isSafe(processes, available, max, allocation);
    int request[R] = {1, 0, 0, 0};
    printf("\nProcess P3 requesting resources: ");
    for (int i = 0; i < R; i++)
    {
        printf("%d ", request[i]);
    }
    printf("\n");
    requestResources(2, request, available, max, allocation);
    return 0;
}