package com.stringmanipulation;

import java.util.HashMap;

public class StringCompression {
    //Compress a string to count the repeated characters. For example, aabbbcccc would be a2b3c4
    //Check if the compressed string is shorter in character length than the original. If not, return the original string
    //Hints: Compress the string first, don't concatenate

    public static String compressString(String input){
        HashMap<Character,Integer> strHash = new HashMap<>();
        //Go through the string and add
        for(int i=0; i<input.length();i++){
            if (strHash.containsKey(input.charAt(i))){
                int count = strHash.get(input.charAt(i));
                strHash.put(input.charAt(i),count+1);
            }else{
                strHash.put(input.charAt(i),1);
            }
        }
        //Build the compressed string using a StringBuilder
        StringBuilder output = new StringBuilder();
        for(char key : strHash.keySet()){
            output.append(key);
            output.append(strHash.get(key).toString());
        }
        return output.length() < input.length() ? output.toString() : input;
    }

    public static void main(String[] args) {
        String input = "antidisestablishmentarianism";
        System.out.println("Input is " + input);
        System.out.println("Compressed string is " + compressString(input));
    }
}
