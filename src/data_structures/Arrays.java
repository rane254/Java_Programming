package data_structures;

import java.util.Scanner;

public class Arrays  {
    public static void main(String[] args) {
        // type[] arrayName = new type[size];
        // type[] arrayName = {1, 2, 3, 4, 5};

        // printMarks();
        linearSearchAlgo();
    }

    public static void printMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array/list: ");
        int size = sc.nextInt();

        int[] marks = new int[size];

        for (int i=0; i<size; i++) {
            System.out.print("Enter marks for subject " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }

        for (int i=0; i<size; i++) {
            System.out.println("Subject " + (i+1) + " : " + marks[i]);
        }
    }


    public static void linearSearchAlgo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array/list: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            System.out.print("Index " + (i) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Number " + num + " found at index " + i);
                break;
            }
        }
    }
}
