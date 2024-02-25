import java.util.Random;

public class practical6prime {
    public static void main(String[] args) {
        // Generate the array of 10 lakh numbers
        int[] numbers = generateNumbers();

        // Calculate the count of prime and non-prime numbers
        long startTime = System.nanoTime();
        int[] count = countPrime(numbers);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Time taken for counting: " + duration + " milliseconds");

        // Invert the if-else statement and calculate the count again
        startTime = System.nanoTime();
        int[] invertedCount = countPrimeInverted(numbers);
        endTime = System.nanoTime();
        long invertedDuration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Time taken for counting with inverted if-else: " + invertedDuration + " milliseconds");

        // Analyze the result
        System.out.println("Prime numbers count: " + count[0]);
        System.out.println("Non-prime numbers count: " + count[1]);
        System.out.println("Prime numbers count with inverted if-else: " + invertedCount[0]);
        System.out.println("Non-prime numbers count with inverted if-else: " + invertedCount[1]);
        System.out.println("Time difference: " + (duration - invertedDuration) + " milliseconds");
    }

    // Function to generate an array of 10 lakh 7-digit numbers
    public static int[] generateNumbers() {
        int[] numbers = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int num = 0;
            for (int j = 0; j < 7; j++) {
                num = num * 10 + random.nextInt(10);
            }
            numbers[i] = num;
        }
        return numbers;
    }

    // Function to count prime and non-prime numbers
    public static int[] countPrime(int[] numbers) {
        int primeCount = 0;
        int nonPrimeCount = 0;
        for (int num : numbers) {
            if (isPrime(num))
                primeCount++;
            else
                nonPrimeCount++;
        }
        return new int[]{primeCount, nonPrimeCount};
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Function to count prime and non-prime numbers with inverted if-else statement
    public static int[] countPrimeInverted(int[] numbers) {
        int primeCount = 0;
        int nonPrimeCount = 0;
        for (int num : numbers) {
            if (!isPrime(num))
                nonPrimeCount++;
            else
                primeCount++;
        }
        return new int[]{primeCount, nonPrimeCount};
    }
}
