package advanced;

import java.util.Arrays;

public class BasicSorts {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the size of an array: ");
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];
//
//        for (int i=0; i<size; i++) {
//            System.out.print("Enter number " + (i+1) + ": ");
//            arr[i] = sc.nextInt();
//        }

        int[] arr = {5, -1, 2, 1, 4, 3, 0};
        System.out.println(Arrays.toString(arr));

        // bubbleSort(arr); // n^2
        // selectionSort(arr); // n^2
         insertionSort(arr);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void display(int[] arr) {
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSwap;
        for (int i=0; i<arr.length-1; i++) {
            isSwap = false;
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
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
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, end);
            swap(arr, maxIndex, end);
        }

        display(arr);
    }

    static int getMaxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i<=end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }


    private static void insertionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }

        display(arr);
    }

}
