import java.util.Scanner;

public class prog7 {
    private int accno;
    private int balance;
    private String bankname;
    private String toa;
    private int amt;

    public void getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the bank: ");
        bankname = scanner.nextLine();
        System.out.print("Enter the account number: ");
        accno = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the type of account: ");
        toa = scanner.nextLine();
        System.out.print("Enter the balance: ");
        balance = scanner.nextInt();
        System.out.print("Enter the amount: ");
        amt = scanner.nextInt();
    }

    public void printdata() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Bank name: " + bankname);
        System.out.println("Account number: " + accno);
        System.out.println("Type of account: " + toa);
        System.out.println("Balance in the account: " + balance);
        System.out.println("Entered amount that has to be credited or debited: " + amt);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void credit() {
        int credit = balance + amt;
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Total balance after the amount that has been credited: " + credit);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void debit() {
        if (balance > amt && balance > 2000) {
            System.out.println("After Withdrawal");
            int debit = balance - amt;
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("The total balance after the amount that has been debited: " + debit);
            System.out.println("--------------------------------------------------------------------------------------");
        } else {
            System.out.println("You have a limited amount in the account");
        }
    }

    public static void main(String[] args) {
        prog7 b1 = new prog7();
        b1.getdata();
        b1.printdata();
        b1.credit();
        b1.debit();
    }
}


