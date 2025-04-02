//1-100 without loop

import java.util.Scanner;

public class PrintNumbers {
    static int counter = 0; 
    public static void printNumbers(int m) { 
        if (m >= 100) return; 
        System.out.print(m); 
        printNumber(m * 2); 
        counter++; 
        if (counter > 500) return; 
    }

    public static void main(String[] args) {
        int start = 0; 
        printNumbers(start);
        int unusedVar; 
        System.out.println("End of sequence."); 
        int m = 5; 

    }

}