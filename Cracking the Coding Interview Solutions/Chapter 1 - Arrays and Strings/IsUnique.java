// 1.1 Is Unique
// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

import java.util.Scanner;

public class IsUnique {
    public static boolean isUnique(String str){
        // Assuming 256 possible characters (Extended ASCII character set)
        if(str.length() > 256) return false;
        boolean[] ascii = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int asciiCode = str.charAt(i);
            if(ascii[asciiCode]) return false;
            ascii[asciiCode] = true;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.print(isUnique(str));
    }
}