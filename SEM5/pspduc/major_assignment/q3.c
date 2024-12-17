#include <stdio.h>

void merge_sorted_arrays(const double *array1, int size1, const double *array2, int size2, double *output, int *output_size) {
    int i = 0, j = 0, k = 0;

    // Merge the two arrays while avoiding duplicates
    while (i < size1 && j < size2) {
        if (array1[i] < array2[j]) {
            // Add to output if not a duplicate
            if (k == 0 || output[k - 1] != array1[i]) {
                output[k++] = array1[i];
            }
            i++;
        } else if (array1[i] > array2[j]) {
            // Add to output if not a duplicate
            if (k == 0 || output[k - 1] != array2[j]) {
                output[k++] = array2[j];
            }
            j++;
        } else {
            // Both values are equal, add one of them and skip duplicates
            if (k == 0 || output[k - 1] != array1[i]) {
                output[k++] = array1[i];
            }
            i++;
            j++;
        }
    }

    // Add remaining elements from array1
    while (i < size1) {
        if (k == 0 || output[k - 1] != array1[i]) {
            output[k++] = array1[i];
        }
        i++;
    }

    // Add remaining elements from array2
    while (j < size2) {
        if (k == 0 || output[k - 1] != array2[j]) {
            output[k++] = array2[j];
        }
        j++;
    }

    *output_size = k; // Update the size of the output array
}

int main() {
    double array1[] = {1.0, 3.0, 5.0, 7.0};
    double array2[] = {2.0, 3.0, 6.0, 8.0};
    
    int size1 = sizeof(array1) / sizeof(array1[0]);
    int size2 = sizeof(array2) / sizeof(array2[0]);
    
    // Allocate memory for the merged output array
    double output[size1 + size2]; 
    int output_size;

    merge_sorted_arrays(array1, size1, array2, size2, output, &output_size);

    // Print the merged result
    printf("Merged Array: ");
    for (int i = 0; i < output_size; i++) {
        printf("%.1f ", output[i]);
    }
    printf("\n");

    return 0;
}
