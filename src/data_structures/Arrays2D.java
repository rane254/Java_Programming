package data_structures;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        print2DNumArr();
    }

    public static void print2DNumArr() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size of an 2D Array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the column size of an 2D Array: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int cnt = 1;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print("Enter number " + (cnt++) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("------------O/p----------");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print("[" + i + "," + j + "] : " + arr[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("------------O/p----------");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
