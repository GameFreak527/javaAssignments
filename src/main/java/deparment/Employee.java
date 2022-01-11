package deparment;

public class Employee {
	private int id ;
	private String name;
	
	//Aggregation many to one relationship
	private Department dept;
	
	public Employee (int id, String name,Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}
	
	private int getId() {
		return id;
	}

	private String getName() {
		return name;
	}

	private Department getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return String.format("Id : %d, Name : %s , Department Name : %s",this.getId(),this.getName() ,this.getDept().getName());
	}

}
