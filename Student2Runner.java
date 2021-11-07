// Created by Aurimas A. Nausedas on 03/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.arrays;

import java.math.BigDecimal;

public class Student2Runner {

	public static void main(String[] args) {
//		int[] marks = { 99, 98, 88, 97 };

		Student2 student = new Student2("David", new int[] { 99, 98, 88, 97, 101 });
		Student2 student1 = new Student2("John", new int[] { 99, 88, 97 });
		Student2 student2 = new Student2("Olivia", new int[] { 89, 100 });

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks: " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Highest mark: " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Lowest mark: " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average mark: " + average);
		System.out.println(student);
		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(2);
		System.out.println(student);

	}

}
