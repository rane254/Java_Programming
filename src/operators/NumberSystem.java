package operators;

public class NumberSystem {
    public static void main(String[] args) {
        bitwiseLRShiftOperators();
    }

    public static void bitwiseLRShiftOperators() {
        System.out.println(4>>2); // 100 >> 2 -> 1 * 2^0(1) = 1
        System.out.println(4<<2); // 100 << 2 -> 100,00 * 2^4+2^3+2^2+2^1+2^0 = 16+0+0+0+0 = 16
    }
}
