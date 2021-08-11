package com.stringmanipulation;

public class myAtoi {
    public static int atoi(String s){
        s = s.trim();
        if (s.length() == 0)
            return 0;
        boolean isNegative = false;
        int startIndex = 0;
        long result = 0L;
        if (s.charAt(0) == '+' || s.charAt(0) == '-'){
            startIndex++;
            if (s.charAt(0) == '-')
                isNegative = true;
        }
        for(int i=startIndex; i< s.length(); i++){
            if (!Character.isDigit(s.charAt(i)))
                break;
            int digit = Character.getNumericValue(s.charAt(i));
            result = 10*result + digit;
        }
        if (result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;

        return isNegative ? (int)result*(-1) : (int)result;
    }
    public static void main(String[] args) {
        String s1 = "-9819 is a number";
        String s2 = "42";
        String s3 = "This number is 898";
        String s4 = "+68874";

        System.out.println(atoi(s1));
        System.out.println(atoi(s2));
        System.out.println(atoi(s3));
        System.out.println(atoi(s4));
    }
}
