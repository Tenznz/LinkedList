package com.data_structure.linkedlist;

public class LinkedList implements LinkedListI {
	Node head;

	private class Node {
		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}
	}

	public boolean add(int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	@Override
	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (temp != null) {
				System.out.print(temp.key + " -> ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public void addAtFirst(int data) {

		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}
}