package ch15;

import java.util.Scanner;

public class IfElseifElseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���尴�� ���̸� �Է��ϼ��� : ");
		int age = scanner.nextInt();
		int charge;
		
		if( age < 8 ) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}
		else if( age < 14 ) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if( age < 17 ) {
			charge = 2500;
			System.out.println("���л��Դϴ�.");
		}
		else if( age < 20 ) {
			charge = 3000;
			System.out.println("����л��Դϴ�.");
		}
		else {
			charge = 4000;
			System.out.println("�Ϲ� ���尴�Դϴ�.");
		}
		
		System.out.println("������ " + charge +  "�� �Դϴ�");
	}

}
