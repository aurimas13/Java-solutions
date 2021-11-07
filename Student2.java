// Created by Aurimas A. Nausedas on 20/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student2 {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student2(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
//		for (int mark : marks) {
//			System.out.println(mark);
//		}
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}
//		int Highest = marks[marks.length - 1];
//		Arrays.sort(marks);
//		return marks[marks.length - 1];
//	}
//		int maximum = Integer.MIN_VALUE;
//		for (int mark : marks) {
//				if(mark > maximum) {
//					maximum = mark;
//				}
//		}
//			return maximum;
//	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}
//		int Lowest = marks[0];
//		Arrays.sort(marks);
//		return marks[0];
//	}
//	int minimum = Integer.MAX_VALUE;
//	for (int mark : marks) {
//			if(mark < minimum) {	
//				minimum = mark;
//			}
//		}
//		return minimum;
//	}
	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

//		return new BigDecimal(sum).divide(new BigDecimal(number));
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

	}

	@Override
	public String toString() {
		return name + marks;

	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
