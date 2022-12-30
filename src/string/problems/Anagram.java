package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if two Strings are Anagram. Two Strings are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Please type 2 words to check if they are anagrams: ");
        System.out.println("Type word 1: ");
        String word1 = scan.next();
        System.out.println("Type word 2: ");
        String word2 = scan.next();

        String lowerCaseWord1= word1.toLowerCase();
        String lowerCaseWord2= word2.toLowerCase();
        System.out.println("you entered "+ word1 + " and "+ word2);
        char str1[] = (lowerCaseWord1).toCharArray();
        char str2[] = (lowerCaseWord2).toCharArray();





        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two words are anagram of each other");
        else
            System.out.println("The two words are not anagram of each other");
        String actual = word1;


    }
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

}