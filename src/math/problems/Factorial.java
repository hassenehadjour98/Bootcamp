package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int unFactorialNum;
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter the number you would like to find the Factorial number of");
     unFactorialNum = scan.nextInt();
        int factorial = findFactorialRecursive(unFactorialNum);
        System.out.println("Factorial of " + unFactorialNum +  " (recursive): " + factorial);

        // find the factorial of unFactorialNum using iteration
        factorial = findFactorialIterative(unFactorialNum);
        System.out.println("Factorial of " + unFactorialNum +  " (iteration): " + factorial);
    }

    public static int findFactorialRecursive(int unFactorialNum ) {
        if (unFactorialNum  == 0) {
            return 1;
        }
        return unFactorialNum  * findFactorialRecursive(unFactorialNum - 1);
    }

    public static int findFactorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }
}
