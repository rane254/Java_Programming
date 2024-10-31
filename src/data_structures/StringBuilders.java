package data_structures;

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your str: ");
        String str = sc.next();

        // System.out.print("Enter the index to search value: ");
        // int idx = sc.nextInt();

        // declarativeClass(str, idx);
//        reverseStr(str);
        strPalindrome(str);

    }

    public static void declarativeClass(String str, int index) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(str);


        System.out.println(sb); // frijesh

        // Read value / Display
        System.out.println("Index " + index + " : " + sb.charAt(index)); // at index 0 : f

        // Write value / Update
        sb.setCharAt(index, 'B');
        System.out.println(sb); // Brijesh

        // append value at the end of the string
        System.out.println(sb.append('R')); // BrijeshR

        // insert value
        System.out.println(sb.insert(sb.length(), "ane")); // BrijeshRane

        // reverse string
        System.out.println(sb.reverse()); // enaRhsejirB
    }

    public static void reverseStr(String str) {
        StringBuilder sb = new StringBuilder(str);

        // iterate over the half of the string to reverse the characters
        for (int i=0; i<sb.length()/2; i++) {
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);

            sb.setCharAt(i, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println("Reverse of " + str + " is " + sb);
    }

    static void strPalindrome(String name) {
        StringBuilder sb = new StringBuilder(name.toLowerCase());
        int start = 0;
        int end = name.length()-1;
        boolean isPalindrome = true;
//        while (start < end) {
//            if (sb.charAt(start) != sb.charAt(end)) {
//                isPalindrome = false;
//                break;
//            }
//            start++;
//            end--;
//        }

        for (int i = 0; i < sb.length()/2; i++) {
            if (sb.charAt(start) != sb.charAt(end)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is a palindrome.");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
