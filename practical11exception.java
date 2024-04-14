public class practical12exception {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;  

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println(" Division by zero is not allowed.\n\n ERROR:");
            e.printStackTrace();
        } 

    }
}
