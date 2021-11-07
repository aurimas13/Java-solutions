// Created by Aurimas A. Nausedas on 20/11/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		String dayWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		
		System.out.println("Day with most number of characters " + dayWithMostCharacters);

	for (int i=daysOfWeek.length-1; i >=0 ; i--) {
			System.out.println(daysOfWeek[i]);
	}
	}

}
