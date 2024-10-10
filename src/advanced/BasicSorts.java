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

        bubbleSort(arr); // n^2
        // selectionSort(arr); // n^2
        // insertionSort(arr);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void display(int[] arr) {
        System.out.print("Sorted array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void bubbleSort(int[] arr) {

        boolean isSwap = false;

        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;

                    swap(arr, j, (j+1));
                    isSwap = true;
                }
            }

            // optimization
            if (!isSwap) {
                display(arr);
                return;
            }
        }

        display(arr);
    }

    public static void selectionSort(int[] arr) {

        for (int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            swap(arr, smallest, i);
        }

        display(arr);
    }

    private static void insertionSort(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            int j=i;
            while (j > 0 && arr[j-1] > arr[j]) {
                swap(arr, j, (j-1));
                j--;
            }
        }

        display(arr);
    }

}
