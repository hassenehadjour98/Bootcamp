package string.problems;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String string = "abc";

        // Compute all permutations of the string
        List<String> permutations = permute(string);

        // Print the permutations
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> permute(String string) {
        // Base case: if the string has only one character, return a list with that character
        if (string.length() == 1) {
            List<String> result = new ArrayList<>();
            result.add(string);
            return result;
        }

        // Recursive case: fix one character of the string at a time and compute all permutations of the remaining characters
        List<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            String remaining = string.substring(0, i) + string.substring(i + 1);
            for (String permutation : permute(remaining)) {
                result.add(c + permutation);
            }
        }
        return result;


    }
}
