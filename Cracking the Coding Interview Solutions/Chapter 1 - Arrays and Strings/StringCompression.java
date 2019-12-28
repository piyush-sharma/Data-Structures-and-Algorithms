// 1.6 String Compression
// Implement a method to perform basic string compression using the counts
// of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3, If the
// "compressed" string would not become smaller than the original string, your method should return
// the original string. You can assume the string has only uppercase and lowercase letters (a - z).

import java.util.Scanner;

public class StringCompression {
    public static String stringCompression(String str){
        StringBuilder compressed = new StringBuilder(str.length());
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            // End of string or character change
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        String compressedString = compressed.toString();
        if(str.length() <= compressedString.length()) return str;
        else return compressedString;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(stringCompression(str));
    }
}