package easy;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
//        int largest = LargestAndSmallest.largest(10, 5, 20);
//        int smallest = LargestAndSmallest.smallest(10, 5, 20);
//
//        System.out.println("Largest: " + largest + "\nSmallest: " + smallest);

//        canVote();
//        checkPrime(11);
//        primeNumRange(1, 11);
        numPalindrome();

    }

    static void numPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, rev = 0;
        while (temp !=0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev) {
            System.out.printf("%d is Palindrome.\n", num);
        } else {
            System.out.printf("%d is not a Palindrome.\n", num);
        }
    }

    static void checkPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i=2; i<=num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.print("Prime Number");
        } else {
            System.out.print("Not a prime number");
        }
    }

    static void primeNumRange(int num1, int num2) {
        for(int i=num1; i<=num2; i++) {
            System.out.print(i+" = ");
            checkPrime(i);
            System.out.println();
        }
    }


    static void canVote() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            if (age < 1) {
                System.out.println("You are not born!");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

    }
}

class LargestAndSmallest {
    static int largest(int n1, int n2, int n3)  {
        int max = n1;

//        if (n1 > n2) {
//            max = Math.max(n1, n3);
//        } else {
//            max = Math.max(n2, n3);
//        }

        if (n2 > max) {
            max = n2;
        } else {
            if (n3 > max) {
                max = n3;
            }
        }

        return max;
    }

    static int smallest(int n1, int n2, int n3)  {
        int min = n1;

//        if (n1 < n2) {
//            min = Math.min(n1, n3);
//        } else {
//            min = Math.min(n2, n3);
//        }

        if (n2 < min) {
            min = n2;
        } else {
            if (n3 < min) {
                min = n3;
            }
        }

        return min;
    }
}