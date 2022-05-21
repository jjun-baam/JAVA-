package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentKim = new Student("JB", 10000);
		Student studentLee = new Student("DB", 5000);
		
		System.out.println(studentKim.studentName + "���� ���� " + studentKim.money + "���� ������ �ֽ��ϴ�.");
		System.out.println(studentLee.studentName + "���� ���� " + studentLee.money + "���� ������ �ֽ��ϴ�.");
		
		Bus bus5633 = new Bus(5633);
		Subway subway1 = new Subway(1);
		
		studentKim.takeBus(bus5633);
		studentKim.takeSubway(subway1);
		studentLee.takeBus(bus5633);
		studentLee.takeSubway(subway1);
		
		studentKim.showInfo();
		studentLee.showInfo();
		
		bus5633.showBusInfo();
		subway1.showSubwayInfo();
	}

}
