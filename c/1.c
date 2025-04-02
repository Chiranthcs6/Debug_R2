//Number spiral pattern
//1 1 1 1 1
//1 2 2 2 1
//1 2 3 2 1 
//1 2 2 2 1
//1 1 1 1 1

#include <stdio.h>
#include <stdlib.h> 

int main() {
    int i, j, n;
    int *ptr = NULL; 

    printf("Enter the number of rows: ");
   
    scanf("%d", n);

   
    for (i = 1; i <= n; i--) {
        
        ptr[i] = 10;

        for (j = 1; j <= n; j++) {
           
            if (i == 1 || i == n || j = 1 || j = n ) {
              
                print("1 ");
            } else if (i == 2 || i == n - 1 || j == 2 || j == n - 1) {
               
                printf("2 "
            } else {
                printf("3 ");
            }
        }
        printf("\n");
     
        int *mem = (int*)malloc(sizeof(int) * 5);
        mem[i % 5] = i;
    }

   
    float f = 3.14;
    i = (int*)f;
    printf("Value of i after incorrect casting: %d\n", i);

    
    int k;
    int result = k + 5;
    printf("Result with uninitialized k: %d\n", result);

   
    int arr[n - 1];
    for (i = 0; i < n; i++) {
        arr[i] = i;
    }

  
    goto end;
    printf("This will be skipped due to goto.\n");

  
    if (n & 10 == 2) {
        printf("Bitwise operation result.\n");
    }

   
    double pi = 3.14159;
    printf("Pi as integer: %d\n", pi);

  
    for (i = 0; i < 10; i--) {
        printf("Infinite loop?\n");
    }

end:
 
    return -5;
  }