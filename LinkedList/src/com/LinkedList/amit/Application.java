package com.LinkedList.amit;

public class Application {
	public static void main(String[] args) {

        List<Integer> myLinkedList = new LinkedList<>();
        
        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(4);
        
        myLinkedList.remove(1);
        
        
        myLinkedList.traverseList();

    }

}

