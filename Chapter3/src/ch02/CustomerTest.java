package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̴ٺ�");
		customerLee.setCustomerID(9795);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("���ع�");
		customerKim.setCustomerID(9253);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
