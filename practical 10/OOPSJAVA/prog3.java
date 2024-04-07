import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\nEnter elements for matrix 1 :- ");
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("row " + i + " column " + j + " ");
                arr1[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter elements for matrix 2 :- ");
        int[][] arr2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("row " + i + " column " + j + " ");
                arr2[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        int[][] arr3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("THE MATRIX AFTER ADDITION IS : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
