#include <stdio.h>
#include <math.h>

int leap(int y){
  return (y % 4 == 0 ? (y % 100 == 0 ? (y % 400 == 0 ? 1 : 0) : 1) : 0);

}

int main(){

    if ((leap(2024)))
    printf("1");
    else 
    printf("0");
    return 0;
}