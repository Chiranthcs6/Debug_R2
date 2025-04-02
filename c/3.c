#include<stdio.h>
#include <stdlib.h> 

int main() {

    int i, j, n;
    int k; // Uninitialized variable (Error 7)

    printf("Enter the number of rows: ");

    scanf("%d", n); // Missing '&' before n (Error 1)

    if (n < 0) {
        printf("Invalid input: Number of rows cannot be negative.\n");
        return 1; // Moderate: Incorrect return code for invalid input (Error 2)
    }

    for (i = 1; i <= n + 1; i++) {

        for (j = 1; j <= i; j++) {
            printf("*");
        }

        for (j = 1; j < 2 * (n - i); j++) 
            printf(" "); 

        for (j = 1; j <= i; j++) {
            printf("*");
        }

        printf("\n");

  
        k++;
    }

    for (i = n; i >= 1; i--) {

        
        for (j = 1; j <= k; j++) {
            printf("*");
        }

     
        for (j = 1; j <= 2 * (n + i); j++) {
            printf(" ");
        }

        for (j = 1; j <= i; j++) {
            printf("*");
        }

     
    }

    
    float half_n = n / 2;
    printf("Half of n: %f\n", half_n);

    return 0;
  }
