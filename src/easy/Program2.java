package easy;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // checkOddEven();
        // greet();
        // calcSimpleInterest();
        // performOperation();
        // printLargest();
        // currencyConverter();
        // printFibSeries();
        // strPalindrome();
        // checkPalindrome();
        checkArmstrong();
    }

    public static void checkOddEven() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your input: ");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void greet() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.printf("Hello %s!", name);
    }

    public static void  calcSimpleInterest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time: ");
        int time = sc.nextInt();
        System.out.println("Enter the principle: ");
        float principle = sc.nextFloat();
        System.out.println("Enter the rate: ");
        float rate = sc.nextFloat();

        float si = (principle * rate * time) / 100;

        System.out.println("Simple Interest: " + si);
    }

    public static void performOperation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the operation to perform +,-,*,/: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' -> {
                System.out.println("Sum: " + (n1+n2));
            }
            case '-' -> {
                System.out.println("Difference: " + (n1-n2));
            }
            case '*' -> {
                System.out.println("Product: " + (n1*n2));
            }
            case '/' -> {
                System.out.println("Quotient: " + (n1/n2));
            }
            default -> {
                System.out.println("Wrong choice!, please try again.");
            }
        }
    }

    public static void printLargest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Largest: " + n1);
        } else {
            System.out.println("Largest: " + n2);
        }
    }

    public static void currencyConverter() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your currency type \n1 -> Dollars\n2 -> Rupees\n-> ");
        int type = sc.nextInt();
        System.out.println("Enter the amount: ");
        long currency = sc.nextLong();

        if (type == 1) {
            long rupees = (long) (currency * 84.07);
            System.out.println("$"+currency+" => Rs"+rupees);
        } else {
            long dollars = (long) (currency / 84.07);
            System.out.println("Rs"+currency+" => $"+dollars);
        }
    }

    public static void printFibSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find fibonacci series: ");
        int n = sc.nextInt();

        int first = 0, second = 1, next;
        System.out.print("0 1 ");
        for (int i=2; i<=n; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }

    public static void strPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the str: ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        int len = sb.length();
        boolean isPalindrome = true;
        for (int i=0; i<sb.length(); i++) {
            if (sb.charAt(i) != sb.charAt(len-1)) {
                isPalindrome = false;
                break;
            }
            len--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the str: ");
        String str = sc.next();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void checkArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.next();

        int len = num.length();

        int n = Integer.parseInt(num);
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result += (int) Math.pow(digit, len);
            n /= 10;
        }

        System.out.println(result);

        if (result == Integer.parseInt(num)) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
