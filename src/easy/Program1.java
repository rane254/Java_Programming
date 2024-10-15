package easy;

import java.util.Objects;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // checkLeapYear();
        // twoSum();
        // tables();
        takeInput();
    }

    public static void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 100 == 0) {
            System.out.println("Not a leap year.");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap year.");
        } else if (year % 4 == 0) {
            System.out.println("Leap year.");
        } else {
            System.out.println("Not a leap year.");
        }
    }

    public static void twoSum() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("Sum: %d", num1+num2);
    }

    public static void tables() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d%n", num1, i, num1*i);
        }
    }

    public static void takeInput() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your input: ");
            System.out.println("Enter x to exit: ");
            String input = sc.next();

            if (Objects.equals(input, "x")) {
                System.out.println("Exiting.....");
                break;
            }
        }
    }
}
