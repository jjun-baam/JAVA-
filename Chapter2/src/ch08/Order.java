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
		System.out.println(String.format("주문 접수 번호 : %s\n"
										+ "주문 핸드폰 번호 : %s\n"
										+ "주문 집 주소 : %s\n"
										+ "주문 날짜 : %s\n"
										+ "주문 시간 : %s\n"
										+ "주문 가격 : %d\n"
										+ "메뉴 번호 : %s", 
										orderId, 
										orderPhoneNum, 
										orderAddr, 
										orderDate, 
										orderTime, 
										orderPrice, 
										menuId));
	}
}
