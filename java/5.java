//Butterfly printing patter

import java.util.Scanner;

public class ButterflyPattern {

public static void butterflyPattern(int n) {

  for (int i = 1; i < n; i++) { 
  for (int j = 1; j <= i - 1; j++)
  System.out.print("*");
  for (int j = 1; j <= 2 * (n - i); j++) 
  System.out.print("-");
  for (int j = 1; j <= i + 1; j++)
  System.out.print("*");
  System.out.println();

  }


  for (int i = n - 1; i > 0; i--) { 
  for (int j = 1; j < i; j++) 
  System.out.print("*");
  for (int j = 1; j <= n - i; j++) 
  System.out.print(" ");
  for (int j = 1; j <= i; j++)
  System.out.print("@");
  System.out.print("*");
  System.out.println();

  }

}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of rows: ");
  int nn = sc.nextInt();
  butterflyPattern(n); 
  sc.close();
  String unused = "Hello"; 

  }

}