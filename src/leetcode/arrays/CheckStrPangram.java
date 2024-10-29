package leetcode.arrays;

public class CheckStrPangram {
    public static void main(String[] args) {
        boolean ans = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");

        if (ans) {
            System.out.println("Is Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }

    // beats 75.11% in TC and 79.97% in SC - optimal solution - try again
    static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] < 1) {
                return false;
            }
        }

        return true;
    }
}
