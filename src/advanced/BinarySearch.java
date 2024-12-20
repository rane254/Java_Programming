package advanced;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int res = bSearch(arr, ele);
        if (res == -1) {
            System.out.println("Element " + ele + " was not found!");
        } else {
            System.out.println("Element " + ele + " was found at index " + res + ".");
        }
    }

    static int bSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int middle = (start+end) / 2;
            if (target == arr[middle]) {
                return middle;
            }

            if (target > arr[middle]) {
                start = middle+1;
            } else {
                end = middle-1;
            }
        }
        return -1;
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
