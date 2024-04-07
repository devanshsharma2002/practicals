public class prog4 {
    public static void main(String[] args) {
        String javaString = "Hello, ";
        javaString += "world!";
        System.out.println("Concatenation using Java String: " + javaString);

        // Using StringBuilder for concatenation
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append("world!");
        String javaConcatenatedString = stringBuilder.toString();
        System.out.println("Concatenation using StringBuilder: " + javaConcatenatedString);

        // Length of strings
        String javaString1 = "This is a  String";
        String javaString2 = "This is another  String";
        System.out.println("Length of Java string 1: " + javaString1.length());
        System.out.println("Length of Java string 2: " + javaString2.length());

        // Comparison
        String javaStr1 = "apple";
        String javaStr2 = "banana";
        if (javaStr1.equals(javaStr2)) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("strings are not equal.");
        }

       
    }

 
    
}
