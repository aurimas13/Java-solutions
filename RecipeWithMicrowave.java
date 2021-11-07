// Created by Aurimas A. Nausedas on 14/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe {

		@Override
		void getReady() {
			System.out.println("Get the raw materials");
			System.out.println("Switch on the microwave");
		}

		@Override
		void doTheDish() {
			System.out.println("Get stuff ready");
			System.out.println("Put in the microwave");
		}

		@Override
		void cleanup() {
			System.out.println("Clean the stuff");
			System.out.println("Switch off the microwave");
		}

	}
