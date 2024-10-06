package functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Invalid Number! Number should be greater than 0");
            return;
        }

        System.out.println("The factorial of " + num + " is " + findFactorial(num));
    }

    public static int findFactorial(int num) {
        int sum = 1;
        while (num != 0) {
            sum *= num;
            num--;
        }
        return sum;
    }
}
