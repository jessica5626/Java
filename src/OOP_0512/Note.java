package OOP_0512;

public class Note {

	// 보통은 객체를 생성하고자 한다면
	// 1. 그 객체의 틀이 되는 클래스를 선언
	// 2. new 연산자를 이용해 그 클래스의 객체를 생성
	
	// ex)
	// public class A {
	// 	public A(String name) { ... }
	// }
	
	// A a = new A("홍길동");
	// A a2 = new A("일지매") {
	// 	...
	// }; 	# public class B extends A {}, A a2 = new B();
	
	// public interface Aif {
	// 	...
	// }
	
	// public class MyClass implements Aif {
	// 	...
	// }
	
	// Aif aif = new MyClass();
	// Aif aif2 = new Aif() {
	// 	...
	// }
	
	// 무명 클래스 표현식의 구성은 다음과 같다.
	// 1. new 연산자
	// 2. 구현할 인터페이스 이름 또는 상속할 클래스 이름
	// 3. 괄호() -> 생성자에게 전달할 인자를 포함하는 괄호
	//	  주의 : 인터페이스를 구현하는 경우, 인터페이스는 생성자가 없기 때문에
	//			괄호는 어떠한 인자도 포함하지 않는다.
	// 4. 몸체 : 클래스 정의 부분 
	// 5. 세미콜론
	
	// 무명 클래스 : 클래스의 정의와 객체 생성을 한 문장으로 해결하는 것
	
}
