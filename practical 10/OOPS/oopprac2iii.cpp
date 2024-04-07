#include <iostream>

int main() {
    int matrix1[3][3];
    int matrix2[3][3];
    int result[3][3];

    // Input values for the first matrix
    std::cout << "Enter values for the first 3x3 matrix:\n";
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            std::cin >> matrix1[i][j];
        }
    }

    // Input values for the second matrix
    std::cout << "Enter values for the second 3x3 matrix:\n";
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            std::cin >> matrix2[i][j];
        }
    }

    // Perform matrix addition
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }

    // Display the result
    std::cout << "Resultant matrix after addition:\n";
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            std::cout << result[i][j] << " ";
        }
        std::cout << "\n";
    }


}