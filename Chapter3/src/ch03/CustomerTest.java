package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(9795, "�̴ٺ�");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(9253, "���ع�");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
