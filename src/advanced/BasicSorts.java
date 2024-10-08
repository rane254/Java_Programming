package advanced;

import java.util.Scanner;

public class BasicSorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // bubbleSort(arr); // n^2
        // selectionSort(arr); // n^2
        insertionSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    private static void insertionSort(int[] arr) {
    }
}
