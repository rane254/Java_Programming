package concepts;

public class StrComparison {
    public static void main(String[] args) {
        String n1 = "Brijesh";
        String n2 = "Brijesh";

        String a = new String("Brijesh");
        String b = new String("Brijesh");

        System.out.println(n1 == n2);;
        System.out.println(n1.equals(n2));

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(b.charAt(0) + " -> " + b.indexOf('B'));
    }
}
