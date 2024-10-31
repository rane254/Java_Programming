package leetcode.sorts;

import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int valueIndex = nums[i] - 1;
                if (nums[i] != nums[valueIndex]) {
                    swap(nums, i, valueIndex);
                } else {
                    return nums[i];
                }
            }
            i++;
        }
        return -1;
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
