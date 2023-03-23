package OOP_0322;

public class Employee {

	private String name;
	private double salary;
	
	// 정적 변수
	private static int count = 0; 
	
	// 생성자
	public Employee(String n, double s) {
		name = n;
		salary = s;
		// 정적 변수인 count를 증가
		count++;
	}
	
	// 객체가 소멸될 때 호출됨
	protected void finalize() {
		// 직원이 하나 줄어드는 것이므로 count를 하나 감소
		count--;
	}
	
	// 정적 메소드
	public static int getCount() {
		return count;
	}
}
