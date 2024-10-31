package concepts;

import java.util.Arrays;

public class StrPerformance {
    public static void main(String[] args) {
//        str();
//        sb();
        String name = "   Brijesh S Rane      ";
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip().lastIndexOf('e')); // 13
    }

    static void str() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }

        System.out.println(Arrays.toString(series.toCharArray()));
    }

    static void sb() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        int[] arr = builder.chars().toArray();
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.printf("%c ", (char) i);
            } else {
                System.out.printf("\n%c ", (char) i);
            }
        }
    }
}
