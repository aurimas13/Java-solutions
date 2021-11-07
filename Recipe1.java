// Created by Aurimas A. Nausedas on 14/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Clean the stuff");
	}

}
