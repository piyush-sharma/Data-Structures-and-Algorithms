import java.util.Scanner;

public class LuhnAlgorithm {
    public static int[] computeArray(String number) {
        int [] digits = toIntArray(number);
        for(int i = digits.length - 2; i >= 0; i -= 2) {
            if (digits[i] * 2 > 9) digits[i] = sumDigits(digits[i] * 2);
            else digits[i] *= 2;
        }
        return digits;
    }
    public static boolean isValid(String number) {
        int[] digits = computeArray(number);
        int sum = 0;
        for(int digit : digits) sum += digit;
        return sum % 10 == 0;
    }
    public static int findMissingDigit(String number){
        if(!number.contains("*")) return -1;
        int[] digits = computeArray(number);
        int sum = 0, missing = 0;
        for(int digit : digits) if(digit >= 0) sum += digit; else missing += digit;
        int target = (int)(Math.ceil(sum/10.0)*10);
        target -= sum;
        int factor = missing/-1;
        for(int i = 0; i < 10; i++) if(sumDigits(i*factor) == target) return i;
        return -1;
    }
    public static int checkDigit(String number){
        if(isValid(number)) return Character.getNumericValue(number.charAt(number.length() - 1));
        else return findMissingDigit(number + '*');
    }
    public static int sumDigits(int num){
        String str = Integer.toString(num);
        int sum = 0;
        for(int i = 0; i < str.length(); i++) sum += Character.getNumericValue(str.charAt(i));
        return sum;
    }
    public static int[] toIntArray(String number){
        int[] digits = new int[number.length()];
        for(int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '*') digits[i] = -1;
            else digits[i] = Character.getNumericValue(number.charAt(i));
        }
        return digits;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        if(number.contains("*")) System.out.print("Missing Digit = " + findMissingDigit(number));
        else if(isValid(number)) System.out.print("Valid" + "\nCheck Digit = " + checkDigit(number));
        else System.out.print("Invalid" + "\nNext Check Digit = " + checkDigit(number));
    }
}