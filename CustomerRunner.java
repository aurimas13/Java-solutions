package aurimas.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("Line street", "Otava", "056786");
		Address workAddress = new Address("Line street for work", "Otava", "053236786");
		Customer customer = new Customer("John", homeAddress);

		customer.setWorkAddress(workAddress);
		System.out.print(customer);

	}

}
