// OOP problem and thsi file calls the functions from MyChar.java and runs them
//
// Created by Aurimas A. Nausedas on 20/11/20.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.oops; 

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());

		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
