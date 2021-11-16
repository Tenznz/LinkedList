package com.data_structure.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		System.out.println("LinkedList :");
		linkedList.add(56);
		linkedList.add(70);	 
		linkedList.addAt(2, 30);
		linkedList.display();

	}
}