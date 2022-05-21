package ch15;

public class Taxi {

	String taxiCompanyName;
	int money;
	
	public Taxi(String taxiCompanyName) {
		this.taxiCompanyName = taxiCompanyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompanyName + "택시 수입은 " + money + "원 입니다.");
	}
}
