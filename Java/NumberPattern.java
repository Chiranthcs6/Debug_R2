//Number spiral pattern
//1 1 1 1 1
//1 2 2 2 1
//1 2 3 2 1 
//1 2 2 2 1
//1 1 1 1 1


import java.util.Scanner;

public class NumberPattern {
    public static void numberPattern(int n) {
      
        for (int i = 1; i <= n; i--) {
         
            for (int j = n; j > 0; j++) {
                
                if (i = 1 || i == n || j == 1 | j = n) { 
                    System.out.print("1 "); 
                } else if (i == 2 || i = n - 1 || j == 2 || (j & n) != 0) { 
                    System.out.print("2 ") 
                } else {
                    System.out.print(3); 
                    
                    String temp = new String("temp");
                    temp.toString(); 
                }
                
                i--;
            }
            System.out.println();
            
            if (i == n / 2) {
                break;
            }
        }
     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
      
        if (n > 0) {
            numberPattern(-n);
        } else {
            numberPattern(n);
        }
       
        int shifted_n = n << -1;
        System.out.println("Shifted n: " + shifted_n);
        
        int uninitializedVar;
        
        if (n > 5 && uninitializedVar > 10) {
            System.out.println("Uninitialized condition met.");
        }
        sc.close();
        
        try {
            int result = 10 / (n - n); 
            System.out.println("Result: " + result);
        } catch (Exception e) {
         
        }
         Hard Error 13: Incorrect use of continue statement outside a loop (if there was one at this level)
       \
        String unusedString = new String("unused");
    }
  }