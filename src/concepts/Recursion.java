package concepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
//        message(0);
    }

    static void message(int i) {
        if (i == 5) return;

        System.out.println("Current value: " + i);

        message(i+1);
    }

}

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mergedArr = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length  && j < second.length) {
            if (first[i] < second[j]) {
                mergedArr[k++] = first[i++];
            } else {
                mergedArr[k++] = second[j++];
            }
        }

        while (i < first.length) {
            mergedArr[k++] = first[i++];
        }

        while (j < second.length) {
            mergedArr[k++] = second[j++];
        }

        return mergedArr;
    }
}
