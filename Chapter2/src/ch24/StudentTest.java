package ch24;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(9324, "�ٺ�");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 100);
		studentLee.showScoreInfo();
		
		System.out.println("=================================");
		
		Student studentKim = new Student(9253, "��");
		studentKim.addSubject("�ڹ�", 100);
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 60);
		studentKim.showScoreInfo();
	}

}
