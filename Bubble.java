//demonstrates bubbleSort
//Time Complexity: O(N**2)

class Bubble {

	private double[] a;
	private int numItems;


	public Bubble(int max) {
		a = new double[max];
		numItems = 0;
	}

	//add elememnt to array
	public void insert(double e) {
		a[numItems] = e;
		numItems++; // increment size

	}
	//show array contents
	public void display() {
		for (int i=0; i < numItems; i++) {
			System.out.println(a[i]);
		}
	}
	public void bubbleSort() {
		int i, j;
		for (i=numItems-1; i > 1; i--) {

			for (j=0; j < i; j++) {

				//if out of order swap them
				if (a[j] > a[j+1]) {
					swap(i, i+1);
				} 
			}
		}
	}
	private void swap(int item1, int item2) {
		double tmp = a[item1];
		a[item1] = a[item2];
		a[item2] = tmp;
	}
}