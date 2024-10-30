package leetcode.sorts;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // This sort works only when the elements are 1-N in an array.
        int[] arr = {3, 0, 1, 5, 4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        int ans = missingNumber(arr);
        System.out.println(ans);

    }

    public static void cyclicSort(int[] arr) {
        int i=0;
        while (i < arr.length) {
            int correctValueIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctValueIndex]) {
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
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
