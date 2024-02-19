import java.util.Random;

public class javaprac6 {
    public static void main(String[] args) {
        
        int size = 1000000;

        
        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(); 
        }

        int prime = 0;
        int nonPrime = 0;

        for (int i = 0; i < size; i++) {
            boolean isPrime = isPrime(arr[i]);
            if (isPrime) {
                prime++;
            } else {
                nonPrime++;
            }
        }

        System.out.println("Total prime numbers: " + prime);
        System.out.println("Total non-prime numbers: " + nonPrime);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

