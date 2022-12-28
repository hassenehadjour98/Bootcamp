package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String string = " ";

        // Check if the string is empty or has only one character
        if (string.length() < 2) {
            System.out.println("Palindrome");
            return;
        }

        // Initialize pointers at the beginning and end of the string
        int start = 0;
        int end = string.length() - 1;

        // While the pointers have not crossed each other
        while (start < end) {
            // If the characters at the pointers are not the same, the string is not a palindrome
            if (string.charAt(start) != string.charAt(end)) {
                System.out.println("Not a palindrome");
                return;
            }
            // Increment the start pointer and decrement the end pointer
            start++;
            end--;
        }

        // If the pointers have crossed each other and all the characters have been checked, the string is a palindrome
        System.out.println("Palindrome");
    }
}
