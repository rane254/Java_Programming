package leetcode.arrays;

import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };

        int ans = maximumWealth(arr);

        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int i=0; i<accounts.length; i++) {
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
            // max = Math.max(max, sum);
        }

        return max;
    }
}

