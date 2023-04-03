package OOP_0331;

public class Employee {
	private String name;
	// 이것이 바로 has-a 관계를 구현한 부분
	private Date birthDate;
	
	public Employee(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", birthDate = " + birthDate + "]";
	}
}
