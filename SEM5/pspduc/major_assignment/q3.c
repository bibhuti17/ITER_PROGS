#include <stdio.h>

void merge(const double *array1, int size1, const double *array2, int size2, double *output, int *output_size, int i, int j, int k)
{
    if (i >= size1 && j >= size2)
    {
        *output_size = k;
        return;
    }

    if (i < size1 && (j >= size2 || array1[i] < array2[j]))
    {
        if (k == 0 || output[k - 1] != array1[i])
        {
            output[k] = array1[i];
            k++;
        }
        merge(array1, size1, array2, size2, output, output_size, i + 1, j, k);
    }
    else if (j < size2 && (i >= size1 || array2[j] < array1[i]))
    {
        if (k == 0 || output[k - 1] != array2[j])
        {
            output[k] = array2[j];
            k++;
        }
        merge(array1, size1, array2, size2, output, output_size, i, j + 1, k);
    }
    else if (i < size1 && j < size2 && array1[i] == array2[j])
    {
        if (k == 0 || output[k - 1] != array1[i])
        {
            output[k] = array1[i];
            k++;
        }
        merge(array1, size1, array2, size2, output, output_size, i + 1, j + 1, k);
    }
}

void merge_arrays(const double *array1, int size1, const double *array2, int size2, double *output, int *output_size)
{
    merge(array1, size1, array2, size2, output, output_size, 0, 0, 0);
}

void main()
{
    int size1, size2, i, output_size;

    printf("Enter the number of elements for the 1st array and 2nd array : \n");
    scanf("%d %d", &size1, &size2);

    double array1[size1], array2[size2], output[size1 + size2];

    printf("Enter %d elements for the 1st array:\n", size1);
    for (i = 0; i < size1; i++)
    {
        scanf("%lf", &array1[i]);
    }

    printf("Enter %d elements for the 2nd array:\n", size2);
    for (i = 0; i < size2; i++)
    {
        scanf("%lf", &array2[i]);
    }

    merge_arrays(array1, size1, array2, size2, output, &output_size);

    printf("Merged Array: ");
    for (int i = 0; i < output_size; i++)
    {
        printf("%.1f ", output[i]);
    }
    printf("\n");
}

// Enter the number of elements for the 1st array and 2nd array : 
// 5 3
// Enter 5 elements for the 1st array:
// 1
// 2
// 3
// 4
// 5
// Enter 3 elements for the 2nd array:
// 1
// 8
// 10
// Merged Array: 1.0 2.0 3.0 4.0 5.0 8.0 10.0 