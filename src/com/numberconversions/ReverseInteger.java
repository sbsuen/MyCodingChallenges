package com.numberconversions;

public class ReverseInteger {
    public static int reverseInteger(int x){
        int reversed = 0;

        if (x < 10 && x > -10)
            return x;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && digit > 7){
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && digit < -8){
                return 0;
            }
            reversed = 10*reversed + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int x = 100002;
        System.out.println("Input: " + x);
        System.out.println("Output: " + reverseInteger(x));
    }
}
