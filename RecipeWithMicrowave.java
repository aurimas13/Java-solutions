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
