#include <stdio.h>

void calculate_lab_statistics(int lab_skills, int report_quality, int project_execution, float *average, int *highest, int *lowest, char *grade) {
    *average = (lab_skills + report_quality + project_execution) / 3.0;
    *highest = lab_skills;
    if (report_quality > *highest) *highest = report_quality;
    if (project_execution > *highest) *highest = project_execution;
    *lowest = lab_skills;
    if (report_quality < *lowest) *lowest = report_quality;
    if (project_execution < *lowest) *lowest = project_execution;

    if (*average >= 90) {
        *grade = 'A';
    } else if (*average >= 80) {
        *grade = 'B';
    } else if (*average >= 70) {
        *grade = 'C';
    } else if (*average >= 60) {
        *grade = 'D';
    } else {
        *grade = 'F';
    }
}

int main() {
    int lab_skills, report_quality, project_execution;
    float average;
    int highest, lowest;
    char grade;

    printf("Enter laboratory skills score (out of 100): ");
    scanf("%d", &lab_skills);
    
    printf("Enter report quality score (out of 100): ");
    scanf("%d", &report_quality);
    
    printf("Enter project execution score (out of 100): ");
    scanf("%d", &project_execution);

    calculate_lab_statistics(lab_skills, report_quality, project_execution, &average, &highest, &lowest, &grade);

    printf("\nLab Performance Statistics:\n");
    printf("Average Score: %.2f\n", average);
    printf("Highest Score: %d\n", highest);
    printf("Lowest Score: %d\n", lowest);
    printf("Lab Performance Grade: %c\n", grade);

    return 0;
}
