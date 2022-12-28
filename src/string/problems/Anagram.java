package string.problems;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String s1 = "ARMY";

        //System.out.println(s1);

        char[] ch = new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            ch[i] = s1.charAt(i);

            System.out.println(ch);

            for (char c : ch) {
                System.out.println(c);

            }

            System.out.println(ch[0]);


        }
    }
}