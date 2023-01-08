package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeLee.serialNum); // static변수는 굳이 인스턴스. 사용안해도 됨
		
		Employee employeeKim = new Employee();
		employeeLee.setEmployeeName("김유신");
		//employeeKim.serialNum++;
		
		System.out.println(employeeLee.getEmployeeName()+employeeLee.getEmployeeId());
		System.out.println(employeeLee.getEmployeeName()+employeeKim.getEmployeeId());

	}

}
