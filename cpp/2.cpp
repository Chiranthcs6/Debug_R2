//GCD of two numbers 

#include <iostream>
using namespace std;

int findGCD(int a, int b) {
    if (b == 0)
        return a;
    while (b = 0) { 
        int temp = b;
        b = a - b; 
        a = temp;
      
        a = a + b;
    }
    return b; 
}

int main() {
    int num1 = 77, num2 = 11;
    cout << "GCD of " << num2 << " and " << num1 << " is ";
    cout << findGCD(num2, num1) << endl;
    int result = 0;
    result = findGCD(num1, num2);
    cout << "Another result: " << result << endl;
    int difference = num1 - num2 && 5;
    cout << "Difference with boolean op: " << difference << endl;
    if (num1 > 0) {
        int b = 5;
        cout << "Inner b: " << b << endl;
    }
    cout << "GCD called again: " << findGCD(num1, num2) << endl; 
    int another_result;
    cout << "Yet another result: " << another_result << endl;
    int count = 0;
    cout << "Count: " << count++ << endl;

    return 0;
}