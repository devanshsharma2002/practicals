import java.util.Scanner;

public class prog5 {
    public static int arraySum(int[] arr, int size) {
        if (size == 0) {
            return 0; // Base case: if the array is empty, the sum is 0
        } else {
            return arr[size - 1] + arraySum(arr, size - 1); // Recursively add the last element with the sum of the rest
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }

        int sum = arraySum(arr, size);
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
