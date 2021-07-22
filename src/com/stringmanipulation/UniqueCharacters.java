package com.stringmanipulation;

public class UniqueCharacters {
    public static boolean isUniqueChars(String input){
        int checker = 0;
        for (int i=0; i<input.length(); i++){
            int val = input.charAt(i) - 'a';
            System.out.println("checker: " + checker);
            System.out.println("val:" + val);
            if ((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Tony";
        if (isUniqueChars(input))
            System.out.println(input + " has all unique characters");
        else
            System.out.println(input + " does not have unique characters");
    }
}
