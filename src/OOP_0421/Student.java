package OOP_0421;

public class Student implements Comparable{

	private String name;
	private String dept;
	public String getName() {
		return name;
	}
	
	public Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public int compareTo(Comparable obj) {
		Student std = (Student)obj;
		return name.compareTo(std.getName());
	}
	
	public static void main(String[] args) {
		
		
	}

}
