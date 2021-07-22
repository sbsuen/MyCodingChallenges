package com.linkedlists;

import java.util.HashMap;

public class RemoveDups {
    //Remove duplicates from an unsorted linked list
    //FOLLOW UP
    //Also try to solve if a temporary buffer is not allowed

    public static String removeDuplicates(String input){
        StringBuilder str = new StringBuilder(input);
        HashMap<Character,Integer> stringHash = new HashMap<>();

        int index1 = 0;
        int index2 = 0;
        while(index1 < input.length() && index2 < str.length()){
            if (stringHash.containsKey(input.charAt(index1))){
                int count = stringHash.get(input.charAt(index1));
                str.deleteCharAt(index2);
                stringHash.put(input.charAt(index1),count++);
                index1++;
            } else{
                stringHash.put(input.charAt(index1), 1);
                index1++;
                index2++;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String input = "ABCEDAFWEFDSZFASFAFW";
        System.out.println(input);
        System.out.println(removeDuplicates(input));
    }
}
