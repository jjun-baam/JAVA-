package chTest;

public class Person {

	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int pay) {
		taxi.take(pay);
		this.money -= pay;
	}
	
	public void showPersoninfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
