package leetcode.arrays;

public class NumGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);
    }

    // O(n^2) - beats 90.93% TC but beats 27.32% SC - may be not optimal solution
    static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        return count;
    }
}
