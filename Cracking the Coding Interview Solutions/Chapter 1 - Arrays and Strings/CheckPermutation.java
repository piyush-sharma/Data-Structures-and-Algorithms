// 1.2 Check Permutation
// Given two strings, write a method to decide if one is a permutation of the other.

import java.util.Scanner;

public class CheckPermutation {
    public static boolean checkPermutation(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        // Assuming 256 possible characters (Extended ASCII character set)
        int[] record = new int[256];
        for(int i = 0; i < str1.length(); i++) record[str1.charAt(i)]++;
        for(int i = 0; i < str2.length(); i++){
            record[str2.charAt(i)]--;
            if(record[str2.charAt(i)] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.print(checkPermutation(str1, str2));
    }
}