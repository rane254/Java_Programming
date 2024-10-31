package concepts;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
//        formatedStr();
        operators();
    }

    static void operators() {
        System.out.printf("'a': %d + 'A': %d = %d\n", 'a'+0, 'A'+0, 'a'+'A'); // 97 + 65 = 162
        System.out.println((char) ('a' + 3)); // explicit conversion
        System.out.println("a" + "A"); // aA
        System.out.println("a" + 1); // a1
        System.out.println("Brijesh" + new ArrayList<>()); // Brijesh[]
//        System.out.println("Brijesh" + new Integer(25)); // Brijesh25
    }

    static void formatedStr() {
        float num = 98.199f;
        float PI = 3.14159f;
        System.out.printf("Formated number is %.2f\n", num);
        System.out.printf("Formated number is %.3f\n", PI);
        String name = "Brijesh";
        String sName = "Rane";
        System.out.printf("Hello my name is %s %s.\n", name, sName);
    }

}
