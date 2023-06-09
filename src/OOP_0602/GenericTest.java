package OOP_0602;

import OOP_0421.Student;

public class GenericTest {

	public static void main(String[] args) {
		
		GenericBox<Integer> box1 = new GenericBox<Integer>();
		box1.setValue(100);
		// 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아준다.
		// box1.setValue("석민이 귀여워"); 
		int val = box1.getValue();	// 명시적인 타입 캐스팅이 필요없다.
		System.out.println("박스에 저장된 값은 [" + val + "] 입니다.");
		
		GenericBox<String> box2 = new GenericBox<String>();
		box2.setValue("석민이는 이쁘고 귀여워");
		// 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아준다.
		// box2.setValue(100);
		String sval = box2.getValue();	// 명시적인 타입 캐스팅이 필요없다.
		System.out.println("박스에 저장된 값은 [" + sval + "] 입니다.");
		
		// 왼쪽에 제네릭 클래스의 적용할 타입이 명시되어 있기 때문에
		// 오른쪽 부분엥서 객체 생성할 때는 타입 파라미터를 생략할 수 있다.
		GenericBox<Student> box3 = new GenericBox<>();
		Student std = new Student("배석민", "컴정");
		box3.setValue(std);
		Student val3 = box3.getValue();
		System.out.println("박스에 저장된 값은 [" + val3.getName() + "] 입니다.");
		
	}

}
