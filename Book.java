package aurimas.oops; // Solution of Object-Oriented Programming problem 

public class Book {
	// instance variable noOfCopies
	private int noOfCopies; // member variable

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
			System.out.println(noOfCopies);
		}

	}

	public void increaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies + howMany);
	}

	public void decreaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies - howMany);
	}
}
