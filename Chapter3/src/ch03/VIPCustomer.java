package ch03;

public class VIPCustomer extends Customer{


	double saleRatio;
	private int agentID;
	
//	public VIPCustomer() {
//		super(0, "no-name");
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		customerGrade = "VIP";
//		System.out.println("VICustomer() call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";

		System.out.println("VICustomer(int, String) call");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
