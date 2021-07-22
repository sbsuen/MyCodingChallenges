package com.stringmanipulation;

public class OneAway {
    //Given two strings, write a function to check if they are one edit or zero edits away
    //3 Edits, add, remove, replace
    //Hints:
    //Start with the easy thing, can you check each condition seperately?
    //What is the relationship between add and remove characters? Do they need to be seperate checks?
    //Can you do all three checks in a single pass?

    private static boolean oneEditReplace(String s1, String s2){
        boolean foundDifference = false;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if (foundDifference)
                    return false;
                foundDifference = true;
            }
        }
        return true;
    }

    private static boolean oneEditInsert(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index2 < s2.length() && index1 < s1.length()){
            if (s1.charAt(index1) != s2.charAt(index2)){
                if (index1 != index2)
                    return false;
                index2++;
            } else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static boolean isOneEditAway(String first, String second){
        if (first.equals(second) || Math.abs(first.length() - second.length()) > 1)
            return false;
        if (first.length() == second.length())
            return oneEditReplace(first, second);
        if (first.length() < second.length())
            return oneEditInsert(first, second);
        if (first.length() > second.length())
            return oneEditInsert(second, first);
        return false;
    }
}
