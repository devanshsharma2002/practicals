//program to find sum of digits in array of 10
public class prog2 {
    public static void main(String[] args) {
        int a = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            a = arr[i] + a;
        }
        System.out.println("\n\n the sum is : " + a);
    }
}
