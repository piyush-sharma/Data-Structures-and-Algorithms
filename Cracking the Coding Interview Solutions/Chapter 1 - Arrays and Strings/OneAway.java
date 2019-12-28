// 1.5 One Away
// There are three types of edits that can be performed on strings: insert a character,
// remove a character, or replace a character. Given two strings, write a function to check if they are
// one edit (or zero edits) away.

import java.util.Scanner;

public class OneAway {
    public static boolean oneAway(String str1, String str2){
        if(str1.equals(str2)) return true; // Exactly equal
        if(Math.abs(str1.length() - str2.length()) > 1) return false; // Insertion and Deletion
        // Replacing one character
        else if (str1.length() == str2.length()) {
            int count = 0;
            for(int i = 0; i < str1.length(); i++) if(str1.charAt(i) != str2.charAt(i)) count++;
            return count <= 1;
        }
        else return false; // false otherwise
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.print(oneAway(str1, str2));
    }
}