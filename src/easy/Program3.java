package easy;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        // checkCase();
        // repeatedCount();
        // printFactors();
        // loops();
        findPower();
    }

    public static void  checkCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = sc.next().trim().charAt(0);
         if (c >= 'a' && c <= 'z') {
             System.out.println("Lowercase Letter");
         } else if (c >= 'A' && c <= 'Z') {
             System.out.println("Uppercase Letter");
         } else {
             System.out.println("Not a string!");
         }
    }

    public static void repeatedCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the character: ");
        char c = sc.next().trim().charAt(0);
        int count = 0;
        char[] arr = input.toCharArray();

        for (char a: arr) {
            if (a == c) {
                count++;
            }
        }

        System.out.println(c + " -> " + count);
    }

    public static void printFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact *= i;
            System.out.print(fact + " ");
        }
        System.out.println("\nFactorial of " + num + " is " + fact);
    }

    public static void printFactors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Factors of " + num + " is ");
        for (int i=1; i<=num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void loops() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            sum += num;

            if (num > largest) {
                largest = num;
            }

            if (num == 0) {
                System.out.println("Sum: " + sum);
                System.out.println("Largest: " + largest);
                break;
            }
        }
    }

    public static void findPower() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the power: ");
        int pow = sc.nextInt();

        System.out.println("Result of " + num + "^" + pow + " = " + power(num, pow));
    }

    public static int power(int number, int exponent) {
        int result = number;

        if (exponent == 0) {
            return 1;
        }

        for (int i=2; i<=exponent; i++) {
            result *= number;
        }

        return result;
    }
}
