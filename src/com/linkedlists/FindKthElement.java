package com.linkedlists;

import java.util.LinkedList;

public class FindKthElement {
    //Find the Kth Element of a Linked List
    //Use runners

    public static void findElement(LinkedList<String> list, int k){
        if (list.size() < k){
            System.out.println("K value is larger than the list size");
            return;
        }
        System.out.println(list.get(list.size() - k));
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Sam");
        list.add("Henry");
        list.add("Tim");
        list.add("Tony");
        list.add("Michael");
        list.add("Manny");
        list.add("Roy");

        findElement(list, 2);
    }
}
