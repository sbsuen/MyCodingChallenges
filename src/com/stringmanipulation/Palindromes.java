package com.stringmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Palindromes {
    public static boolean isPalindromeSimple(String str){
        StringBuilder word = new StringBuilder(str);
        word.reverse();

        if (str.equals(word.toString())) {
            return true;
        }
        return false;
    }

    private static HashMap<Character,Integer> createHash(String input){
        HashMap<Character,Integer> output = new HashMap<>();
        for (int i=0; i<input.length(); i++){
            if (output.containsKey(input.charAt(i))){
                int count = output.get(input.charAt(i));
                output.put(input.charAt(i),count+1);
            }else{
                output.put(input.charAt(i),1);
            }
        }
        return output;
    }

    public static boolean isPermutationOfPalindrome(String input){
        HashMap<Character,Integer> strHash = createHash(input);
        boolean foundOdd = false;

        for (char key : strHash.keySet()){
            if (foundOdd)
                return false;
            if (strHash.get(key) % 2 != 0){
                foundOdd = true;
            }
        }
        return true;
    }

    @Test
    public void isPalindromeTest(){
        Assertions.assertTrue(isPalindromeSimple("racecar"));
        Assertions.assertFalse(isPalindromeSimple("Racecar"));
        Assertions.assertFalse(isPalindromeSimple("toby"));
        Assertions.assertTrue(isPermutationOfPalindrome("atcocta"));
    }
}
