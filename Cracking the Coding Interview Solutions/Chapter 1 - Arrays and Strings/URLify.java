// 1.3 URLify
// Write a method to replace all spaces in a string with '%20'. You may assume that the string
// has sufficient space at the end to hold the additional characters, and that you are given the "true"
// length of the string.

import java.util.Scanner;

public class URLify {
    public static String urlify(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') sb.append("%20");
            else sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(urlify(str.trim()));
    }
}