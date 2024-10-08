package easy;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your input: ");
        String x = sc.nextLine();

        char[] arr = x.toCharArray();

        int count = 0;

        for (char c : arr) {
            if (c == ' ') count++;
        }

        System.out.println(x);
        System.out.println("Total count: " + count);
    }
}
