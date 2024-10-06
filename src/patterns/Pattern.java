package patterns;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // printRightAngleTriangle(num);
        // printSolidRectangle(num);
        // printHollowRectangle(num);
        // printInvertedRightAngleTriangle(num);
        // printLeftAngleTriangle(num);
        // printRightAngleNumbers(num);
        // printInvertedRightAngleNumbers(num);
        // printRightAngleWaterfallNumbers(num);
        printZeroOneTriangle(num);
    }

    public static void printRightAngleTriangle(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.print('\n');
        }

    }

    public static void printRightAngleNumbers(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }

    }

    public static void printLeftAngleTriangle(int num) {
        for (int i=1; i<num; i++) {
            for (int j=num; j>=0; j--) {
                if (j >= i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print('\n');
        }

    }

    public static void printInvertedRightAngleTriangle(int num) {
        for (int i=num-1; i>0; i--) {
            for (int j=1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.print('\n');
        }

    }

    public static void printInvertedRightAngleNumbers(int num) {
        for (int i=num; i>0; i--) {
            for (int j=1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }

    }

    public static void printRightAngleWaterfallNumbers(int num) {
        int k=1;
        for (int i=1; i<=num; i++) {
            for (int j=1; j <=i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.print('\n');
        }

    }

    public static void printZeroOneTriangle(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j <=i; j++) {
               if ((i + j) % 2 == 0) {
                   System.out.print("1 ");
               } else {
                   System.out.print("0 ");
               }
            }
            System.out.print('\n');
        }

    }

    public static void printSolidRectangle(int num) {
        for (int i=1; i<num; i++) {
            for (int j=1; j<=num; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }

    public static void printHollowRectangle(int num) {
        for (int i=1; i<num; i++) {
            for (int j=1; j<=num; j++) {
                // cell -> (i, j)
                if (i == 1 || j == 1 || i == num-1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
    }
}
