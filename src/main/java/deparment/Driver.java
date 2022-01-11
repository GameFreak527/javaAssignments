package deparment;

public class Driver {
	
	public static void main(String[] args) {
		
		//Creating department
		Department d1 = new Department(1,"Art");
		Department d2 = new Department(2,"Commerce");
		Department d3 = new Department(3,"Medical");
		Department d4 = new Department(4,"Non-Medical");
		
		//Creating Employees
		
		Employee e1 = new Employee(1,"Ramesh",d1);
		Employee e2 = new Employee(1,"Kamlesh",d1);
		Employee e3 = new Employee(1,"Raju",d1);
		Employee e4 = new Employee(1,"Sam",d3);
		
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		d1.addEmployee(e3);
		d3.addEmployee(e4);
		
		System.out.println(d1);
		System.out.println(e1);
		
		
		
	}

}
