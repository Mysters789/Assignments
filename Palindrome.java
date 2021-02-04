package com.sparta.malik;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        if (word.length() == 0) {
            //as the string is null
            return false;
        }
        if (word.length() == 1) {
            //as the string is a single character, we know it is!
            return true;
        }
        word.replaceAll("\\s+", "").toLowerCase();
        int forward = 0;
        int backward = word.length() - 1;
        while (backward > forward) {
            char forwardChar = word.charAt(forward++);
            char backwardChar = word.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }

    public static String findLongestPalindrome(String sentence) {
        String longestWord = null;
        if (sentence.length() == 0) {
            Printer.printErrorMessage("sentence is Emtpy!");
        } else {
            String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            int highestLength = 0;
            for (String word : words) {
                if (isPalindrome(word)) {
                    if (word.length() > highestLength) {
                        highestLength = word.length();
                        longestWord = word;
                    } else if (word.length() == highestLength) {
                        longestWord += " or " + word;
                    }
                }
            }
        }
        return longestWord;
    }
}
