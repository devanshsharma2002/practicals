import java.util.Scanner;

public class practical12 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String args[]) {
        boolean what;
        String name;
        System.out.println("Do you belong to college SGGS? (type 'y' or 'n')");
        name = scn.nextLine();
        if (name.equals("y")) {
            System.out.println("Welcome you");
            book();
        } else {
            System.out.println("Be a part of SGGS first");
        }
    }

    public static void book() {
        int pick = 0;
        System.out.println("1. Student\n");
        System.out.println("2. Faculty\n");
        System.out.println("3. Staff\n");
        System.out.print("Pick one of them: ");
        pick = scn.nextInt();
        System.out.println("You can borrow the book");
        switch (pick) {
            case 1:
                System.out.println("What do you want");
                break;
            case 2:
                System.out.println("Hello, Willing to read a book..!");
                break;
            case 3:
                System.out.println("Hello, How are you..!");
                break;
            default:
                System.out.println("Please enter a valid option. Thank you");
        }
        scn.nextLine(); // Consume newline character
        bookName();
    }

    public static void bookName() {
        String name1;
        System.out.print("Enter the name of the book: ");
        name1 = scn.nextLine();
        String name2;
        System.out.print("Enter the name of the author: ");
        name2 = scn.nextLine();
        System.out.println("You have successfully issued book '" + name1 + "' of author '" + name2 + "' from the library & don't forget to return it after 10 days. Thank you");
    }
}