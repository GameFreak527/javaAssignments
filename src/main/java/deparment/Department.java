package deparment;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private int id;
	private String name ;
	
	//One to many relationship
	//Upcasting Arraylist to List as List is the parent class
	private List <Employee> employees;
	
	public Department (int id, String name) {
		employees = new ArrayList<>();
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void showEmployees() {
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}
	
	public void addEmployee(Employee emp) {
		this.employees.add(emp);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
}
