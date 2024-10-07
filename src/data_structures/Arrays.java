package data_structures;

import java.util.Scanner;

public class Arrays  {
    public static void main(String[] args) {
        // type[] arrayName = new type[size];
        // type[] arrayName = {1, 2, 3, 4, 5};

        // printMarks();
        // linearSearchAlgo();
        // findMinMaxNum();
        isAscendingArr();
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

    public static void findMinMaxNum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array/list: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }

            if (ele < min) {
                min = ele;
            }
        }

        System.out.println("Maximum: " + max + "\nMinimum: " + min);
    }

    public static void isAscendingArr() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array/list: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i=0; i<size-1; i++) {
            if (arr[i] > arr[i+1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("The arr is in ascending order.");
        } else {
            System.out.println("The arr is not in ascending order.");
        }
    }
}
