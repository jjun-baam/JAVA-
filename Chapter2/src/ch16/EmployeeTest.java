package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeK = new Employee();
		employeeK.setEmployeeName("���ع�");
		
		Employee employeeL = new Employee();
		employeeL.setEmployeeName("�̴ٺ�");
		
		System.out.println(employeeK.getEmployeeName() + "���� ����� " + employeeK.getEmployeeId());	
		System.out.println(employeeL.getEmployeeName() + "���� ����� " + employeeL.getEmployeeId());
		
	}

}
