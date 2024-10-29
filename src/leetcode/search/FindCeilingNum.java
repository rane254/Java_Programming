package leetcode.search;

import java.util.Arrays;

public class FindCeilingNum {
    public static void main(String[] args) {
        // ceiling = smallest number from an array starting from number >= target number
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ans = findCeiling(arr, 14);
        System.out.println(ans);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // O(n/2) - may be an optimal solution, reduces the size of loop by half
    static int findCeiling(int[] arr, int target) {
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;

        // binary search
        while (start < end) {
            int mid = (start+end) / 2;
            if (target >= arr[mid]) {
                start = mid;
            } else {
                end = mid;
            }

            for (int i = start; i <=end; i++) {
                if (arr[i] >= target) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
