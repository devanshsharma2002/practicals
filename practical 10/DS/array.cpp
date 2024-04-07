#include <iostream>
using namespace std;

int main() {
    // Declare an array of integers
    int arr[5] = {1, 2, 3, 4, 5};
    
    // Accessing elements of the array
    cout << "Array elements: ";
    for (int i = 0; i < 5; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    // Update an element
    arr[2] = 10;
    
    // Accessing updated array
    cout << "Updated array elements: ";
    for (int i = 0; i < 5; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    return 0;
}
