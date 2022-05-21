package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeK = new Employee();
		employeeK.setEmployeeName("±Ë¡ÿπ¸");
		
		Employee employeeL = new Employee();
		employeeL.setEmployeeName("¿Ã¥Ÿ∫Û");
		
		System.out.println(employeeK.getEmployeeName() + "¥‘¿« ªÁπ¯¿∫ " + employeeK.getEmployeeId());	
		System.out.println(employeeL.getEmployeeName() + "¥‘¿« ªÁπ¯¿∫ " + employeeL.getEmployeeId());
		
	}

}
