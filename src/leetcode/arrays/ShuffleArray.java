package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Leetcode - 1470
/// IMP - try again
public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] ans = shuffle(nums, 3);

        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int first = 0;
        int second = n;
        int index = 0;
        while (first < n && second < nums.length) {
            arr[index] = nums[first++];
            arr[index+1] = nums[second++];
            index += 2;
        }

        return arr;
    }
}
