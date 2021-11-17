package com.data_structure.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		System.out.println("LinkedList :");
		linkedList.add(56);
		linkedList.add(70);
		System.out.println("Adding 30 to node 2 ");
		linkedList.addAt(2, 30);
		linkedList.display();
		// System.out.println(linkedList.searchNode(70));
		linkedList.add(30, 40);
		System.out.println("Adding 40 after 30 ");
		linkedList.display();
		linkedList.pop(40);
		System.out.println("After Deleting 40");
		linkedList.display();
		System.out.println(linkedList.getSize() + " is total size.");

	}
}