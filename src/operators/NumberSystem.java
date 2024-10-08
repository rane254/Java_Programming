package operators;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        // bitwiseLRShiftOperators();
        bitManipulation();
    }

    public static void bitwiseLRShiftOperators() {
        System.out.println(4>>2); // 100 >> 2 -> 1 * 2^0(1) = 1
        System.out.println(4<<2); // 100 << 2 -> 100,00 * 2^4+2^3+2^2+2^1+2^0 = 16+0+0+0+0 = 16
    }

    public static void bitManipulation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        String binNum = Integer.toBinaryString(n);
        System.out.println("Binary number of " + n + " is " + binNum);

        System.out.print("Enter the position of the bit: ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        if (pos > binNum.length() || pos < 0) {
            System.out.println("Position out of bound!");
            return;
        }

        String finalBitMask = Integer.toBinaryString(bitMask & n);

        System.out.println("Binary number after AND operation on Bit Mask: " + finalBitMask);

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero.");
        } else {
            System.out.println("Bit was non-zero.");
        }
    }
}
