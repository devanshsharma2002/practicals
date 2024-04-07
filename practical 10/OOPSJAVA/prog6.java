import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter 1 for ADDITION(+)");
            System.out.println("Enter 2 for SUBSTRACTION(-)");
            System.out.println("Enter 3 for MULTIPLICATION(*)");
            System.out.println("Enter 4 for DIVISION(/)");
            System.out.println("Enter 5 to find REMAINDER");
            System.out.println("Enter 6 for SQUARE");
            System.out.println("Enter 7 for SQUARE ROOT");
            System.out.println("Enter 8 for LOG");
            System.out.println("Enter 9 for CUBE");
            System.out.println("Enter 10 for CUBE ROOT");
            System.out.println("Enter 0 to exit");

            System.out.print("\nEnter operation no.: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            float n = 0, m = 0, q = 0; // Initialize variables with default values

            if (choice < 6) {
                System.out.print("\nEnter first number: ");
                n = scanner.nextFloat();
                System.out.print("\nEnter second number: ");
                m = scanner.nextFloat();
            } else {
                System.out.print("\nEnter number: ");
                q = scanner.nextFloat();
            }

            switch (choice) {
                case 1:
                    System.out.println("Addition= " + add(n, m));
                    break;
                case 2:
                    System.out.println("Subtraction= " + sub(n, m));
                    break;
                case 3:
                    System.out.println("Multiplication= " + mult(n, m));
                    break;
                case 4:
                    System.out.println("Division= " + div(n, m));
                    break;
                case 5:
                    System.out.println("Remainder= " + mod((int) n, (int) m));
                    break;
                case 6:
                    System.out.println("Square= " + sqr(q));
                    break;
                case 7:
                    System.out.println("Square Root= " + sqroot(q));
                    break;
                case 8:
                    System.out.println("Log= " + lg(q));
                    break;
                case 9:
                    System.out.println("Cube= " + cub(q));
                    break;
                case 10:
                    System.out.println("Cube Root= " + cubroot(q));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static float add(float x, float y) {
        return x + y;
    }

    public static float sub(float x, float y) {
        return x - y;
    }

    public static float mult(float x, float y) {
        return x * y;
    }

    public static float div(float x, float y) {
        return x / y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }

    public static float sqr(float x) {
        return x * x;
    }

    public static float sqroot(float x) {
        return (float) Math.sqrt(x);
    }

    public static float lg(float x) {
        return (float) Math.log10(x);
    }

    public static float cub(float x) {
        return x * x * x;
    }

    public static float cubroot(float x) {
        return (float) Math.cbrt(x);
    }
}