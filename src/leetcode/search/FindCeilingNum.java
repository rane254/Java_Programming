package leetcode.search;

public class FindCeilingNum {
    public static void main(String[] args) {
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

    static int findCeiling(int[] arr, int target) {
        bubbleSort(arr);
        for (int j : arr) {
            if (j >= target) {
                return j;
            }
        }
        return -1;
    }
}
