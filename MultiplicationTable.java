// Multiplication Table Problem 
//
// Created by Aurimas A. Nausedas on 18/11/20.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.firstjavaproject;

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
