class Data {
	int[] data = {100,92,43,87,23};
	Sorter s;
	
	public Data(Sorter s) {
		this.s = s;
	}
	public void setSorter(Sorter s) {
		this.s = s;
	}
	public void sort() {
		System.out.println("Sorting...");
		s.sort(data);
	}
	public void show() {
		for (int d: data)
			System.out.println(d);
	}
}

class SelectionSorter implements Sorter {
	// YOU CODE HERE
}

class BubbleSorter implements Sorter {
	public void sort(int[] d) {
		// YOU CODE HERE
	}
}

interface Sorter{
	// YOU CODE HERE
}



public class StrategyApp01 {

	public static void main(String[] args) {
		// Use SELECTION Sort
		Sorter s1 = new SelectionSorter();
		// ONE LINE CODE
		data.sort();
		data.show();

		// USE BUBBLE SORT
		// YOU CODE HERE
	}
}
