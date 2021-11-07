// Created by Aurimas A. Nausedas on 13/01/21.
// Updated by Aurimas A. Nausedas on 07/11/21.
//

package aurimas.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOPS", "Aurimas");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);
	}

}
