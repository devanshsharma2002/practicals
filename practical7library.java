import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isCheckedOut;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }
}

class Student {
    int studentId;
    String name;
    List<Book> checkedOutBooks;

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.checkedOutBooks = new ArrayList<>();
    }
}

class Library {
    List<Book> books;
    List<Student> students;

    Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    boolean checkOutBook(Book book, Student student, String dueDate) {
        if (book.isCheckedOut) {
            return false; // Book already checked out
        }
        book.isCheckedOut = true;
        student.checkedOutBooks.add(book);
        return true;
    }

    boolean returnBook(Book book, Student student) {
        if (!book.isCheckedOut || !student.checkedOutBooks.contains(book)) {
            return false; // Book not checked out
        }
        book.isCheckedOut = false;
        student.checkedOutBooks.remove(book);
        return true;
    }
}

public class practical7library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        // Adding students
        Student student1 = new Student(1, "devansh");
        Student student2 = new Student(2, "sharma");
        library.addStudent(student1);
        library.addStudent(student2);
        System.out.println("Welcome to the Library Management System!");
        // User 1 checks out a book
        System.out.print("\nEnter the title of the book you want (User 1): ");
        String bookTitle1 = scanner.nextLine();
        System.out.print("Enter the author of the book (User 1): ");
        String bookAuthor1 = scanner.nextLine();
        System.out.print("Enter the due date (YYYY-MM-DD) (User 1): ");
        String dueDate1 = scanner.nextLine();
        Book requestedBook = new Book(bookTitle1, bookAuthor1);
        if (library.checkOutBook(requestedBook, student1, dueDate1)) {
            System.out.println("Book checked out successfully by User 1!");
        } else {
            System.out.println("Sorry, the book is already checked out.");
        }
        // User 2 checks out a book
        System.out.print("\nEnter the title of the book you want (User 2): ");
        String bookTitle2 = scanner.nextLine();
        System.out.print("Enter the author of the book (User 2): ");
        String bookAuthor2 = scanner.nextLine();
        System.out.print("Enter the due date (YYYY-MM-DD) (User 2): ");
        String dueDate2 = scanner.nextLine();
        Book requestedBook2 = new Book(bookTitle2, bookAuthor2);
        if (requestedBook.title.equals(requestedBook2.title) && requestedBook.author.equals(requestedBook2.author)
                && requestedBook.isCheckedOut) {
            System.out.println("Sorry, the book is already checked out by User 1.");
        } else {
            if (library.checkOutBook(requestedBook2, student2, dueDate2)) {
                System.out.println("Book checked out successfully by User 2!");
            } else {
                System.out.println("Sorry, the book is already checked out.");
            }
        }
        scanner.close();
    }
}