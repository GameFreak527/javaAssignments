package cloning;

public class Student implements Cloneable{
	private int id;
	private String name;
	private Teacher teacher;
	
	public Student(int id, String name,Teacher teacher) {
		this.setId(id);
		this.setName(name);
		this.setTeacher(teacher);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Object clone() throws CloneNotSupportedException {
		//First clone the Student
		Student st = (Student) super.clone();
		//Seconly clone teacher and add it to the clone
		st.setTeacher((Teacher) this.getTeacher().clone());
		return st;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		return (this.getId() == student.getId() && this.getName().equals(student.getName()) && this.getTeacher().equals(student.getTeacher()));
	}
}
