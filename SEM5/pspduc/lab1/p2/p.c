#include <stdio.h>

void main() {
    int population, numToilet, numFlushesDay, waterSavedToilet, totalWaterSaved, costPerToilet, totalPrice;

    printf("Enter the population of the community: ");
    scanf("%d", &population);

    numToilet = population / 3;
    numFlushesDay = 14;
    waterSavedToilet = 15 - 2;
    totalWaterSaved = numToilet * numFlushesDay * waterSavedToilet;
    costPerToilet = 150;
    totalPrice = numToilet * costPerToilet;

    printf("Estimated water saved per day: %d liters\n", totalWaterSaved);
    printf("Total cost to install new toilets: $%d\n", totalPrice);
}