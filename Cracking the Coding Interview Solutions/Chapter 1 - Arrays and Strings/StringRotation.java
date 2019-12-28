// 1.9 String Rotation
// Assume you have a method isSubstring which checks if one word is a substring
// of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
// call to isSubstring (e.g., "waterbottle " is a rotation of 'erbottlewat").
//                     erbottlewat       erbottlewat

import java.util.Scanner;

public class StringRotation {
    public static boolean isSubstring(String longer, String shorter){
        return longer.contains(shorter);
    }
    public static boolean stringRotation(String s1, String s2){
        if(s1.length() > 0 && s2.length() > 0 && s1.length() == s2.length()) {
            return isSubstring(s2 + s2, s1);
        }
        else return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.print(stringRotation(s1, s2));
    }
}