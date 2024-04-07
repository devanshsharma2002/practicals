//program to find factorial
class Fact{
public int Fact(){
    int a = 0, b = 1, c = 1;
    a = 5; // the number for factorial
    System.out.println(
            "this is a factorial calculator \nenter the number for which factorial has to be found out  : " + a);

    for (int i = 1; i <= a; i++) {

        b = b * i;

    }
    System.out.println("the factorial is " + b);
    return 0;
}
}
public class prog1 {
    public static void main(String[] args) {
        Fact Fact=new Fact();
        Fact.Fact();
    }
}
