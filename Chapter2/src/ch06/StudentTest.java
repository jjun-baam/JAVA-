package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(201730206, "���ع�", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
