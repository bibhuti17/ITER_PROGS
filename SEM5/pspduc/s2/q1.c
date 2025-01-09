#include <stdio.h>

#define MAX_BRANDS 4

int main()
{
    int brandIDs[MAX_BRANDS] = {1, 2, 3, 4};
    int quantities[MAX_BRANDS];

    printf("Enter initial inventory for each brand:\n");
    for (int i = 0; i < MAX_BRANDS; i++)
    {
        printf("Brand ID %d: ", brandIDs[i]);
        scanf("%d", &quantities[i]);
    }

    int transactions, brandID, amount;

    printf("Enter number of transactions: ");
    scanf("%d", &transactions);

    for (int i = 0; i < transactions; i++)
    {
        printf("Enter brand ID and amount (negative for sale, positive for purchase): ");
        scanf("%d %d", &brandID, &amount);

        for (int j = 0; j < MAX_BRANDS; j++)
        {
            if (brandIDs[j] == brandID)
            {
                quantities[j] += amount;
                break;
            }
        }
    }

    printf("\nFinal Inventory:\n");
    printf("Brand ID | Quantity\n");
    printf("---------------------\n");
    for (int i = 0; i < MAX_BRANDS; i++)
    {
        printf("%d        | %d\n", brandIDs[i], quantities[i]);
    }

    return 0;
}
