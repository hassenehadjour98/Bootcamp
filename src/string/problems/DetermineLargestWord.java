package string.problems;

import java.lang.module.FindException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s ="Human brain is a biological learning machine";

        HashMap<String, Integer> wordLengths = new HashMap<>();
        for (String word : s.split("\\s+")) {
            wordLengths.put(word, word.length());
        }
        String longestWord = "";
        for (Map.Entry<String, Integer> entry : wordLengths.entrySet()) {
            if (entry.getValue() > longestWord.length()) {
                longestWord = entry.getKey();
            }
        }
        //ANSWER:
        System.out.println(longestWord.length() +" "+ longestWord);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] words = wordGiven.split("\\s+");
        //implement
        for (String word : words) {
            map.put(word.length(), word);
        }
        return map;
    }
}
