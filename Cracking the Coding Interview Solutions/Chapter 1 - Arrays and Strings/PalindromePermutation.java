// 1.4 Palindrome Permutation
// Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
// that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to
// be limited to just dictionary words.

import java.util.Scanner;

public class PalindromePermutation {
    public static boolean palindromePermutation(String str){
        // Assuming 128 possible characters (ASCII character set)
        int[] record = new int[128];
        for(int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            // Only alphanumeric characters
            if(Character.isAlphabetic(c) || Character.isDigit(c))
                record[c]++;
        }
        int oddCount = 0;
        for(int value : record) if (value % 2 == 1) oddCount++;
        return oddCount <= 1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.print(palindromePermutation(str));
    }
}