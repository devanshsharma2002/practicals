class Num {
    private int x;
    private int y;

    public Num(int a, int b) {
        x = a;
        y = b;
    }

    public void unaryMinus() {
        x = -x;
        y = -y;
    }

    public void increment() {
        x++;
        y++;
    }

    public void decrement() {
        x--;
        y--;
    }

    public void print() {
        System.out.println("Your number is " + x + " and " + y);
    }
}

class Complex {
    private int x;
    private int y;

    public Complex(int a, int b) {
        x = a;
        y = b;
    }

    public Complex add(Complex p) {
        return new Complex(x + p.x, y + p.y);
    }

    public Complex subtract(Complex p) {
        return new Complex(x - p.x, y - p.y);
    }

    public void printComplex() {
        System.out.println("Your complex number is " + x + " + " + y + "i");
    }
}

public class prog9 {
    public static void main(String[] args) {
        Num p = new Num(5, 6);
        p.print();
        p.unaryMinus();
        p.print();
        p.decrement();
        p.print();
        p.increment();
        p.print();

        Complex b = new Complex(6, 7);
        b.printComplex();
        Complex c = new Complex(8, 0);
        c.printComplex();

        System.out.println("Addition of two complex numbers:");
        Complex h = b.add(c);
        h.printComplex();

        System.out.println("Subtraction of two complex numbers:");
        Complex m = b.subtract(c);
        m.printComplex();
    }
}

