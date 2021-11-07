// Created by Aurimas A. Nausedas on 10/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.
//

package aurimas.oops.level2;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
