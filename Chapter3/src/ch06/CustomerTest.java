package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10011, "James");
		Customer customerR = new GoldCustomer(10012, "Rusi");
		Customer customerP = new GoldCustomer(10013, "Parker");
		Customer customerK = new VIPCustomer(10014, "kavin");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerR);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "���� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
		}
	}

}
