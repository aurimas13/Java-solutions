// Created by Aurimas A. Nausedas on 14/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.oops.level2;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();

		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}

}
