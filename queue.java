//Demonstrate a Queue

import java.io.*;

class Queue {

	private int maxSize;
	private int[] q;
	private int front;
	private int back;
	private int numItems;

	public Queue() {
		q = new int[maxSize];
		front = 0;
		back = -1;
		numItems = 0;
	}

	//put item at back of queue
	public void insert(int e) {
		q[++back] = e;
		numItems++; 
	}

	//take item from front of queue
	public int remove() {

		int tmp = q[++front];
		numItems--;
		return tmp;

	}

	//check front of queue
	public int check() {
		return q[front];
	}

	//check if queue is empty
	public boolean isEmpty() {
		return (numItems == 0);
	}

	//return sixe of queue
	public int size() {
		return numItems;
	}

}