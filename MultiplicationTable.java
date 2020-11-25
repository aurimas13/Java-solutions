package aurimas.firstjavaproject; // Multiplication Table problem 

public class MultiplicationTable {
	
	void print() {
		print(5);
	}
	
	void print(int table) {
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}

}
