package functions;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        // Q1. Take input of two numbers & print the sum?
        printSum();

    }

    public static void printSum() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter x to exit or continue: ");
            char op = sc.next().toLowerCase().charAt(0);

            if (op == 'x') {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter number 1: ");
            int n1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            int n2 = sc.nextInt();

            System.out.println(n1+" + "+n2+" = "+(n1+n2));
            System.out.println("-------------------------");
        }
    }
}
