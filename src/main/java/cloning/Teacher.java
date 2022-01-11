package cloning;

public class Teacher implements Cloneable{
	private int id;
	private String name;
	
	public Teacher(int id, String name) {
		this.setId(id);
		this.setName(name);
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
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Teacher teacher = (Teacher)obj;
		return (this.getId() == teacher.getId() && this.getName().equals(teacher.getName()));
	}
	
	
}
