package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(9795, "¿Ã¥Ÿ∫Û");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(9253, "±Ë¡ÿπ¸");
		customerKim.bonusPoint = 10000;
		price =customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(0000, "no-name");
		price = vc.calcPrice(1000);
		System.out.println(price);
	}

}
