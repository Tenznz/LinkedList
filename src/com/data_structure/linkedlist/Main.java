package com.data_structure.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		System.out.println("LinkedList :");
		linkedList.add(30);
		linkedList.add(70);
		
		linkedList.addAtFirst(56);
		linkedList.display();
	}

}