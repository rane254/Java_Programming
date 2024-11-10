package easy;

public class TrickyInterviewQuestions {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                if (k % 2 == 0) {
                    System.out.print(((char) ('a' + k++) + " ").toUpperCase());
                } else {
                    System.out.print(((char) ('a' + k++) + " ").toLowerCase());
                }
            }
            System.out.println();
        }
    }
}
