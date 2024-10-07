package data_structures;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Strings are immutable -> once declared cannot be changed, modified or deleted

        // declarativeStr();
        // concatStr();
        // compareNames();
        // subStr();
        strManipulationMethods();
    }

    public static void declarativeStr() {
        String name = "Brijesh";
        String fullName = "Brijesh Rane";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        fullName = sc.nextLine();

        System.out.println("Your full name is " + fullName);
    }

    public static void concatStr() {
        String firstName = "Brijesh";
        String lastName = "Rane";

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName + ": " + firstName.length());

        // charAt(index) - pre-built method
        for (int i=0; i<firstName.length(); i++) {
            System.out.print(firstName.charAt(i) + " ");
        }
    }

    public static void compareNames() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name 1: ");
        String name1 = sc.next();

        System.out.print("Enter your name 2: ");
        String name2 = sc.next();

        // str1 > str2 => +ve value
        // str1 == str2 => 0
        // str1 < str2 => -ve value

        System.out.println("First case");
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal!");
        }

        System.out.println("Second case");
        // if (name1 == name2) {} -> not a good practice to compare two strings
        // for ex;
        if (new String(name1) == new String(name2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    public static void subStr() {
        String str = "Hello World!";

        // str.substring(beginIndex, < endIndex) -> brijesh.substring(0, 4) -> brij.

        System.out.println(str + ": " + str.length());
        System.out.println(str.substring(6, str.length()-1));
    }

    public static void strManipulationMethods() {
        String numStr = "12345";
        int num = 12345;

        if (numStr.equals(Integer.toString(num))) {
            System.out.println("Number 12345 converted to string");
        }

        if (num == Integer.parseInt(numStr)) {
            System.out.println("String 12345 converted to number");
        }
    }
}
