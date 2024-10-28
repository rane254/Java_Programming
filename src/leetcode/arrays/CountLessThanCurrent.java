package leetcode.arrays;

import java.util.Arrays;

public class CountLessThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }

    // not optimal solution
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num != nums[i] && nums[i] > num) {
                    count++;
                }
            }
            arr[i] = count;
        }
        
        return arr;
    }
}
