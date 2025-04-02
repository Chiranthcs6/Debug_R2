//Staircase pattern prinitng program

import java.util.Scanner;


  public class Staircase {
    public static void printStaircase(int n) {
    for (int i = 1; i <= n; i++) {
    for (int j = 0; j < n - i; j++) { 

      System.out.print("  ");
    }
    for (int k = 1; k <= i; k++) {
      System.out.print("$");
    }
    System.out.println();
  }

}

public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of steps: ");
  int m = scanner.nextInt(); 
  printStaircase(n); 
  scanner.close();
  int unusedVariable; 
  int sum = 0;
  for (int i = 0; i < 5; i++) {
  sum += i;
}
  System.out.println("Sum is " + suM); 
  System.out.println("End of program")

  }

}