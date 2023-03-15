package OOP_0313;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		// p.name = "홍길동";
		// p.age = 23;
		// 멤버변수들은 특별한 이유가 없는 이상 모두 private
		
		p.setAge(-20);
		String d = p.dept;
		System.out.println(p.getAge());
		
		// p.age = -200;
		// System.out.println(p.age);
		
		System.out.println(p.getName());
		System.out.println(p.getDept());
		
	}

}
