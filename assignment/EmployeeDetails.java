package week2.day3.assignment;

public class EmployeeDetails {
	public void employeeName(String name, int id) {
		System.out.println(name + id);
	}
	public void employeeAddress(String address) {
		System.out.println(address);
	}
	public void employeeSalary(double salary) {
		System.out.println(salary);
	}
	public void employeeMobile(long number) {
		System.out.println(number);
	}
	public static void main(String[] args) {
		EmployeeDetails empDet = new EmployeeDetails();
		empDet.employeeName("Visnu", 15);
		empDet.employeeAddress("Chennai, Tamilnadu");
		empDet.employeeSalary(45559.58);
		empDet.employeeMobile(6383958846l);

		
	}

}
