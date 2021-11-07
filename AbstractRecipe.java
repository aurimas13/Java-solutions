// Created by Aurimas A. Nausedas on 01/10/21.
// Updated by Aurimas A. Nausedas on 11/07/21.
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
