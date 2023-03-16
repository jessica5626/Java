package OOP_0315;

public class StudentTest {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		/* 
		   private으로 지정했기 때문에 접근이 불가능함
		   std.name = "홍길동";
		   std.birthYear = 2002;
		*/
		
		
		std.setName("고길동");
		std.setBirthYear(2002);
		
		System.out.println(std.getName());
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		
	}

}
