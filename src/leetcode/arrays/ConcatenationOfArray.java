package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        getConcatenation(arr);
    }

//    // beats 8% - brute force solution
//    public static void getConcatenation(int[] nums) {
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i=0; i<2; i++) {
//            for (int ele : nums) {
//                temp.add(ele);
//            }
//        }
//
//        int[] arr = new int[temp.size()];
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = temp.get(i);
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }

    // beats 97.72% in TC & 98.84% in SC - optimal solution
    public static void getConcatenation(int[] nums) {
        int lenArr = nums.length * 2;
        int lenNum = nums.length;
        int[] arr = new int[lenArr];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i+lenNum] = nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
