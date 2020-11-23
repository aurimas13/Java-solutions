package com.in28minutes.oops; // Solution of Object-Oriented Programming problem

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(10000);

		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.setNoOfCopies(137);
		effectiveJava.setNoOfCopies(1193);
		cleanCode.setNoOfCopies(47732);
		
		artOfComputerProgramming.decreaseNoOfCopies(123);
//		System.out.println(artOfComputerProgramming);

	}

}
