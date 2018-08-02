//Demonstrates a priority queue

import java.io.*;

class PriorityQ {

	private int maxSize;
	private double[] q;
	private int numItems;

	public PriorityQ(int mazSize) {
		q = new double[maxSize];
		numItems = 0;
	}

	//Insert item
	public void insert(double e) {
		int i;
		//if no items, insert at Index 0
		if (numItems == 0) {
			q[numItems++] = e;
		}
		else {
			//start at end
			for (i=numItems; i>=0; i--) {
				//if larger, move upward
				if (e > q[i]) {
					q[i+1] = q[i];
				}
				else {
					break;
				}
			}

			q[i + 1] = e;
			numItems++;

		}

	}

	//remove last item
	public double remove() {
		return q[--numItems];

	}
	//check last item
	public double check() {
		return q[numItems - 1];
	}

	//check if queue is empty
	public boolean isEmpty() {
		return (numItems == 0);
	}


}