package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt(); // Size of an array

//        int[] arr; // Declaration
//        arr = new int[size]; // Initialization

        ArrayList<Integer> arr = new ArrayList<>(size);

        for (int i=0; i<size; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr.add(sc.nextInt());
        }

//        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

        while (true) {
            System.out.print("Enter 1. continue or 2. stop: ");
            int op = sc.nextInt();

            if (op == 2) {
                System.out.println("Stopping...");
                break;
            }

            System.out.print("\nEnter the index 1: ");
            int index1 = sc.nextInt();
            System.out.print("Enter the index 2: ");
            int index2 = sc.nextInt();
            change(arr, index1, index2);
            System.out.println();
//            System.out.println(Arrays.toString(arr));
            System.out.println(arr);
        }
    }

    static void change(ArrayList<Integer> arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;

        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
}
