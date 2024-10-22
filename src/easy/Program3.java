package easy;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        // checkCase();
        // repeatedCount();
        // printFactors();
        // loops();
        // findPower();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the item amount: ");
//        double originalAmt = sc.nextDouble();
//        System.out.print("Enter the depreciation cost: ");
//        double depreciationCost = sc.nextDouble();
//        System.out.print("Enter the rate of interest %: ");
//        double interestRate = sc.nextDouble();
//        System.out.print("Enter the year of purchase: ");
//        int itemPurchased = sc.nextInt();
//        Deprecation d = new Deprecation(originalAmt, depreciationCost, interestRate, itemPurchased);
//        d.calculateCost();
        evenDays();
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

    public static void evenDays() {
        Map<String, Integer> calendar = new HashMap<>();
        calendar.put("january", 31);
        calendar.put("february", 28); // or 29 for leap year
        calendar.put("march", 31);
        calendar.put("april", 30);
        calendar.put("may", 31);
        calendar.put("june", 30);
        calendar.put("july", 31);
        calendar.put("august", 31);
        calendar.put("september", 30);
        calendar.put("october", 31);
        calendar.put("november", 30);
        calendar.put("december", 31);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String input = sc.next().trim().toLowerCase();

        int days = calendar.get(input);
        int count = 0;
        for (int i=1; i<=days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even days in " + input + " is " + count);
        System.out.println("Odd days in " + input + " is " + (days-count));
    }
}

class Deprecation {
    double originalCost, deprecatedCost, rateOfInterest;
    int year;

    Deprecation(double originalCost, double deprecatedCost, double rateOfInterest, int year) {
        this.originalCost = originalCost;
        this.deprecatedCost = deprecatedCost;
        this.rateOfInterest = rateOfInterest;
        this.year = year;
    }

    public void calculateCost() {
        double depreciationCost = 0;
        double initialValue = this.originalCost;
        int len = calculateYears(this.year);
        for (int i=0; i<len; i++) {
            depreciationCost = (initialValue - this.deprecatedCost) * this.rateOfInterest;
            initialValue -= depreciationCost;
        }
        System.out.println("After 5 years\nOriginal Cost: " + this.originalCost + "\nDepreciation Cost: " + depreciationCost + "\nDeprecated Value: " + initialValue);
    }

    public static int calculateYears(int year) {
        int years = 0;
        int currentYear = 2024;
        years = currentYear -year;
        return years;
    }
}