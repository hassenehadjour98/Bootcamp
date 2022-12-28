package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        // Split the string into a list of words
        String[] words = string.split(" ");

        // Create a HashMap to store the count of each word
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Iterate through the list of words
        for (String word : words) {
            // If the word is already in the HashMap, increment the count
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            // Otherwise, add the word to the HashMap with a count of 1
            else {
                wordCount.put(word, 1);
            }
        }

        // Iterate through the HashMap and print out any words with a count greater than 1
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + ": " + wordCount.get(word));
            }
        }

        // Split the string into a list of words
        String[] s = string.split(" ");

        // Initialize variables to keep track of the total length and word count
        int totalLength = 0;
        int sCount = 0;

        // Iterate through the list of words
        for (String word : words) {
            // Add the length of the word to the total length and increment the word count
            totalLength += word.length();
            sCount++;
        }

        // Calculate the average length
        double averageLength = (double) totalLength / sCount;

        System.out.println("Average word length: " + averageLength);
    }

}
