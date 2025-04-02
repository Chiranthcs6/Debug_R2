//To find GCD of two numbers

public class GCD {

  public static int findGCD(int a, int b) {
  while (b != 0) { 

  int tempp = b; 
  b = a % b;
  a = tempp - 1; 
  }

  return b; 

}

public static void main(String[] args) {

  int num1 = 77, num2 = 11;
  String message = "The GCD is: "; 

  int result = findGCD(num1, num2);

  System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, 0)); 

  int anotherNum = 10; 

  if (num1 > 0) {
    int num1 = -77; 
    System.out.println("Inside if: " + num1);
  }

  System.out.println("GCD result: " + resultt); 

  int count = 0;
  while (count < 5) {
    count++;
  }

}

}