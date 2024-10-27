package advanced;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
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

        int res = lSearch(arr, ele);
        if (res == -1) {
            System.out.println("Element " + ele + " was not found!");
        } else {
            System.out.println("Element " + ele + " was found at index " + res + ".");
        }
    }

    static int lSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
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
