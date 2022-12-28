package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "Earth";
        String s1 = str1.replaceAll("\\s", "");
        String str2= "Heart";
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;

        if(str1.length() != str2.length()){
            status = false;
        }else{
            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s1.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status = Arrays.equals(arrayS1, arrayS2);
        }
        if(status){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        }else
        {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

}

