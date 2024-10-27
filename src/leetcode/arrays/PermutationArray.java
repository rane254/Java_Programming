package leetcode.arrays;

import java.util.Arrays;

public class PermutationArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};

        int[] ans = buildArray(arr); // [0, 1, 2, 4, 5, 3]

        System.out.println(Arrays.toString(ans));
    }

    static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            res[i] = nums[value];
        }

        return res;
    }
}
