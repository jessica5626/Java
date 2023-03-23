package OOP_0323;

public class Employee {
	
	// 이름 : public 멤버
	public String name;
	// 주소 : package 멤버
	String address;
	// 월급 : protected 멤버
	protected int salary;
	// 주민등록번호 : private 멤버
	private int rrn;
	
	public Employee(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", address = " + address + ", salary = " + salary + ", rrn = " + rrn +"]";
	}
}
