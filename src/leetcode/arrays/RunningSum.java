package leetcode.arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);

        System.out.println(Arrays.toString(ans));
    }

    // beats 100% in TC but beats 59.54% in SC - optimal solution
    static int[] runningSum(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            nums[i+1] += nums[i];
        }
        return nums;
    }
}
