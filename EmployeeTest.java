
package Lab_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mike" , 47899, "Accounting", "VP");
		Employee e2 = new Employee("Mark", 455252);
		Employee e3 = new Employee();
		
		e2.setDepartment("IT");
		e2.setPosition("Developer");
		e3.setName("Tedd");
		e3.setIdNumber(81774);
		e3.setDepartment("Sales");
		e3.setPosition("SalesPerson");
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
	}

}
