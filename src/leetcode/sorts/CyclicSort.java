package leetcode.sorts;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // This sort works only when the elements are 1-N in an array.
        int[] arr = {3, 2, 1, 5, 4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
//        int ans = missingNumber(arr);
//        System.out.println(ans);

    }

    public static void cyclicSort(int[] arr) {
        int i=0;
        while (i < arr.length) {
            int correctValueIndex = arr[i] -1;
            if (arr[i] != arr[correctValueIndex]) {
                swap(arr, i, correctValueIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctValueIndex) {
        int temp = arr[i];
        arr[i] = arr[correctValueIndex];
        arr[correctValueIndex] = temp;
    }


    static int missingNumber(int[] nums) {
        int missing = 0;

        return missing;
    }
}
