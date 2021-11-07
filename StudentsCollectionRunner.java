// Created by Aurimas A. Nausedas on 03/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Aurimas"),
			new Student(100, "John"),
				new Student(2, "Emma"));

		List<Student> studentsAI = new ArrayList<>(students);

		System.out.println(students);

		Collections.sort(studentsAI);
		System.out.println("Descending" + studentsAI);

		Collections.sort(studentsAI, new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + studentsAI);
		
		studentsAI.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + studentsAI);

	}

}
