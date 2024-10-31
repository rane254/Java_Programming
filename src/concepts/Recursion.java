package concepts;

public class Recursion {
    public static void main(String[] args) {
        message(0);
    }

    static void message(int i) {
        if (i == 5) return;

        System.out.println("Current value: " + i);

        message(i+1);
    }

}
