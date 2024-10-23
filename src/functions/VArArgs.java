package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VArArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2,3,4,5,6,7");
        int n = sc.nextInt();
//        fun(1, 4, 3, 5, 7, 8);
        multiArgs(n,2,3,4,5,6,7);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v)); // prints array/list of variable length args
    }

    static void multiArgs(int s, int ...i) {
        System.out.println(Arrays.binarySearch(i, s));
    }
}
