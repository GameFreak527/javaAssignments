package cloning;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Teacher t1 = new Teacher(1,"Shiv");
		 
		Student s1 = new Student (1,"Rana",t1);
		Student s2 = (Student) s1.clone();
		
		s2.getTeacher().setName("Draco");
		s2.setName("Kumar");
		
		Driver.callByValue(s2);
		System.out.println(s2);
		
	}
	
	public static void cloning(Student s1, Student s2) {
		
		if(!s1.equals(s2)) {
			System.out.println("Shallow cloning of student object is done");
		}
		else {
			System.out.println("Shallow cloning failed");
		}
		
		if( ! s1.getTeacher().equals(s2.getTeacher())) {
			System.out.println("Deep cloning is done");
		}
		else {
			System.out.println("Deep Cloning failed");
		}
	}
	
	public static void callByValue(Student student) {
		student.setName("Duke");
		student.setId(99);
		System.out.println(student);
	}

}
