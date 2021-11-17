package com.data_structure.linkedlist;

public interface LinkedListI {
	public boolean add(int data);

	public void display();

	public void addAtFirst(int data);

	public void addAt(int position, int data);

	int pop();

	int popLast();

	boolean searchNode(int data);
	public boolean pop(int data);

	void add(int data1, int data);
}
