package leetcode.arrays;

import advanced.BasicSorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(Arrays.toString(candies));
        List<Boolean> ans = kidsWithCandies(candies, 3);
        System.out.println(ans);
    }

    // O(n^2) - beats 14.49 % in TC but beats 97.35 % in SC - not optimal solution
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> list = new ArrayList<>(List.of());
//
//        for (int i : candies) {
//            boolean isGreater = true;
//            for (int candy : candies) {
//                if ((i + extraCandies) < candy) {
//                    isGreater = false;
//                    break;
//                }
//            }
//            list.add(isGreater);
//        }
//        return list;
//    }

    // O(n) - beats 88.03 % in TC but beats 99.77 % in SC - optimal solution
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;

        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        List<Boolean> result = new ArrayList<>(List.of());

        for (int candy : candies) {
            if ((candy + extraCandies) >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
