public class prog8 {
    private int b, h, s1, s2;

    public prog8() {
        b = 10;
        h = 5;
        s1 = 5;
        s2 = 15;
    }

    public prog8(int x, int y, int p, int q) {
        b = x;
        h = y;
        s1 = p;
        s2 = q;
    }

    public prog8(prog8 ref) {
        b = ref.b;
        h = ref.h;
        s1 = ref.s1;
        s2 = ref.s2;
    }

    public void area() {
        System.out.println("Area of triangle: " + ((b * h) / 2));
    }

    public void perimeter() {
        System.out.println("Perimeter of triangle: " + (2 * (s1 + s2)));
    }

    public static void main(String[] args) {
        prog8 t1 = new prog8();
        t1.area();
        t1.perimeter();
    }
}

