package leetcode.sorts;

import java.util.Arrays;

// TLE - Not an optimal solution - Try again
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    static boolean containsDuplicate(int[] nums) {
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }

        return false;
    }

    static void bubbleSort(int[] arr) {
        boolean isSwap;
        for (int i=0; i<arr.length-1; i++) {
            isSwap = false;
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
