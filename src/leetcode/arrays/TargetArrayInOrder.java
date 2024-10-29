package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    // O(n) - beats 100% in TC, but beats 11.14% in SC - may be optimal solution
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
