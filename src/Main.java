import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // System.out.println('0' * 1); // ASCII Value

        Scanner sc = new Scanner(System.in);

// Initializes objects to read user input from the console.
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String input = br.readLine();


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println(sum);

//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.println("O/p => " + name);
        greet(input);

    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
        System.out.print("Let's study\nJava");
    }
}