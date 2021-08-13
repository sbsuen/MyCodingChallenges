package com.stringmanipulation;

public class StringRotation {
    public static boolean isRotation(String s, String goal){
        return (s.length() == goal.length() && (s+s).contains(goal));
    }

    /* Use this only if concatenation is not allowed */
    public static boolean isRotationNoConcatenation(String s, String goal){
        if (s.length() != goal.length())
            return false;
        StringBuilder tempString = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            char temp = tempString.charAt(0);
            tempString.deleteCharAt(0);
            tempString.append(temp);
            if (tempString.toString().equals(goal))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
