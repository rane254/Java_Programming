package functions;

public class Overloading {
    public static void main(String[] args) {
        String fName = "brijesh";
        String lName = "rane";
        String mName = "shivanand";

        // Function Overloading
        // Functions with same name but different parameters
        fun(fName);
        fun(fName, lName);
        fun(fName, mName, lName);
    }

    static void fun(String a) {
        System.out.println(a);
    }
    static void fun(String a, String b) {
        System.out.println(a+" "+b);
    }

    static void fun(String a, String b, String c) {
        System.out.println(a+" "+b+" "+c);
    }
}
