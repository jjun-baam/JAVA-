package chTest;

public class Test {

	public static void main(String[] args) {

		Person person1 = new Person("Edward", 20000);
		Person person2 = new Person("JeBee", 30000);
		
		Taxi taxi1 = new Taxi("잘나간다 운수");
		
		person1.takeTaxi(taxi1, 10000);
		person2.takeTaxi(taxi1, 20000);
		
		person1.showPersoninfo();
		person2.showPersoninfo();
		
		taxi1.showTaxiInfo();
	}

}
