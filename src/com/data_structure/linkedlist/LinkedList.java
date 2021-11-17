package com.data_structure.linkedlist;

public class LinkedList implements LinkedListI {
	Node head;
	int size = 0;

	private class Node {
		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}
	}

	@Override
	public boolean add(int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
			size++;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
			size++;
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

	@Override
	public void addAtFirst(int data) {

		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	@Override
	public int pop() {
		if (head == null) {
			System.out.println("List is empty, hence deletation not possible");
			return 0;
		} else {
			Node temp = head;
			head = temp.next;
			size--;
			return temp.key;
		}
	}

	@Override
	public int popLast() {
		int data;
		if (head == null) {
			System.out.println("List is empty, hence deletation not possible");
			return 0;
		} else if (head.next == null) {
			Node temp = head;
			head = null;
			size--;
			return temp.key;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			data = temp.next.key;
			temp.next = null; // tail
		}
		size--;
		return data;
	}

	@Override
	public void addAt(int position, int data) {
		if (position < 1) {
			System.out.println("Invalid Position");
		} else if (position == 1) {
			addAtFirst(data);
		} else {
			Node newNode = new Node(data);
			Node temp = head;
			int count = 1;
			while (count < position - 1) {
				temp = temp.next;
				count++;
			}
			Node curr = temp.next;
			temp.next = newNode;
			newNode.next = curr;
			size++;
		}
	}
	@Override
	public void add(int data1, int data) {

		Node newNode = new Node(data);

		if (!searchNode(data1)) {
			return;
		}
		Node temp = head;
		while (temp != null) {

			if (temp.key == data1) {
				break;
			}
			temp = temp.next;
		}

		Node curr = temp.next;
		temp.next = newNode;
		newNode.next = curr;
		size++;

	}

	@Override
	public boolean searchNode(int elememt) {
		if (head == null) {

			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		boolean isFound = false;
		while (temp != null) {
			if (temp.key == elememt) {
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		return isFound;
	}
	@Override
	public boolean pop(int data) {
		if (!searchNode(data)) {
			System.out.println("Data not present");
			return false;
		}
		Node temp = head;
		Node prev = null;
		if (temp != null && temp.key == data) {
			head = temp.next;
			size--;
			return true;
		}
		while (temp != null) {
			if (temp.key == data) {
				prev.next = temp.next;
				size--;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		return false;

	}

	public int getSize() {
		return size;
	}

}