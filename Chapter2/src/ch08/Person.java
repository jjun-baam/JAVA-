package ch08;

public class Person {

	public int height;
	public int weight;
	public int age;
	public String gender;
	public String name;
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void personInfo() {
		System.out.println(String.format("Ű�� %d �̰� �����԰� %d ų���� %s�� �ֽ��ϴ�. "
				+ "�̸��� %s �̰� ���̴� %d���Դϴ�.", height, weight, gender, name, age));
	}
}
