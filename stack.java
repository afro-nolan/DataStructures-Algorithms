//Demonstrate a Stack

import java.io.*;

class Stack {

	private int maxSize;
	private double[] s;
	// top of stack
	private int top;

	public void Stack(int maxSize ) {
		// create array
		s = new double[maxSize];
		top = -1;

	}

	//put item on top of stack
	public void push(double e) {
		s[++top] = e;
	}

	//take item from top of stack
	public double pop() {
		return s[top--];
	}

	//check top of stack
	public double peek() {
		return s[top];
	}
	//check if stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	//check if stack is full
	public boolean isFull() {
		return (top == maxSize-1);
	}




}