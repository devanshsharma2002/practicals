#include <iostream>

// Recursive function to find the sum of elements in an array
int arraySum(int arr[], int size) {
    if (size == 0) {
        return 0; // Base case: if the array is empty, the sum is 0
    } else {
        return arr[size - 1] + arraySum(arr, size - 1); // Recursively add the last element with the sum of the rest
    }
}

int main() {
    int size;
    std::cout << "Enter the size of the array: ";
    std::cin >> size;

    int arr[size];

    std::cout << "Enter " << size << " elements:\n";
    for (int i = 0; i < size; ++i) {
        std::cin >> arr[i];
    }

    int sum = arraySum(arr, size);
    std::cout << "The sum of all elements in the array is: " << sum << std::endl;


}