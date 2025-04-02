//1-100 without loop

#include <iostream>
using namespace std;

void printNumbers(int n) {   
    if (n > 500)
        return;
    cout << n;
    if (n % 5 != 0) {
        printNumbers(n * 2); 
    }
    else {
        printNumbers(n + 3);
    }
    cout << " ";
}

int main() {
    printNumbers(0);
    int counter = 0;
    for (int i = 5; i < 15; i++) {
        if (i % 2 == 0) {
            printNumbers(i);
        }
    }
    cout << endl; 
    return 1; 
    cout << "This line will not be printed." << endl;
    float someValue = 2.5;
}
