package ch08;

public class Order {

	public String orderId;
	public String orderPhoneNum;
	public String orderAddr;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String menuId;
	
	public Order
		  ( String orderId, 
			String orderPhoneNum, 
			String orderAddr, 
			String orderDate, 
			String orderTime, 
			int orderPrice, 
			String menuId ) 
	{
		this.orderId = orderId; 
		this.orderPhoneNum = orderPhoneNum; 
		this.orderAddr = orderAddr;
		this.orderDate = orderDate;
		this.orderTime = orderTime; 
		this.orderPrice = orderPrice; 
		this.menuId = menuId;
	}
	
	public void orderInfo() {
		System.out.println(String.format("�ֹ� ���� ��ȣ : %s\n"
										+ "�ֹ� �ڵ��� ��ȣ : %s\n"
										+ "�ֹ� �� �ּ� : %s\n"
										+ "�ֹ� ��¥ : %s\n"
										+ "�ֹ� �ð� : %s\n"
										+ "�ֹ� ���� : %d\n"
										+ "�޴� ��ȣ : %s", 
										orderId, 
										orderPhoneNum, 
										orderAddr, 
										orderDate, 
										orderTime, 
										orderPrice, 
										menuId));
	}
}
