#include <iostream>

int main() {
    int array[10]; // Declare an array of 10 integers
    int sum = 0;

    // Input 10 numbers into the array
    std::cout << "Enter 10 numbers:\n";
    for (int i = 0; i < 10; ++i) {
        std::cin >> array[i];
    }

    // Calculate the sum of digits in the array
    for (int i = 0; i < 10; ++i) {
        int num = array[i];
        while (num != 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10;      // Remove the last digit
        }
    }

    std::cout << "The sum of digits in the array is: " << sum << std::endl;


}