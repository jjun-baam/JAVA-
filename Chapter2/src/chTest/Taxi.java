package chTest;

public class Taxi {

	private String taxiCompany;
	private int taxiMoney;
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	public void take(int taxiMoney) {
		this.taxiMoney += taxiMoney;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany+" 택시 수입은 "+taxiMoney+"원 입니다.");
	}
}
