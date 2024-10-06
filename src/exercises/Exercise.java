package exercises;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // printAvgUserInput();
        // printNOddSum();
        // printGreaterNum();
        // printCircumference();
        // canVote();
        // infiniteLoop();
        displayCountNNumbers();
    }

    public static void printAvgUserInput() {
        Scanner sc = new Scanner(System.in);

        float a, b, c;
        System.out.println("Enter the 3 numbers");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        System.out.println("The average of 3 numbers is " + (a + b + c) / 3);
    }

    public static void printNOddSum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int sum = 0;
        while (a != 0) {
            if (a  % 2 == 1) {
                sum += a;
            }
            a--;
        }
        System.out.println("The sum of n odd numbers is " + sum);
    }

    public static void printGreaterNum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }

    public static void printCircumference() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        System.out.println("The circumference of the circle is " + 2 * 3.14 * radius);
    }

    public static void canVote() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are able to vote");
        } else{
            System.out.println("You are not able to vote");
        }
    }

    public static void infiniteLoop() {
        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter 1 to exit or 2 to continue: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Exiting.....");
                break;
            }
        }
    }

    public static void displayCountNNumbers() {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zeros = 0;
        while (true) {
            System.out.println("Enter 12345 to quit!");
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if (num == 12345) {
                System.out.println("Exiting.....");
                break;
            }
            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println("Positive: " + positive + "\n" + "Negative: " + negative + "\n" + "Zeros: " + zeros);
    }

}
