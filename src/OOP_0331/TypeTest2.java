package OOP_0331;

class A {
	A() {  }
}

// B는 A로부터 상속받아 작성됨
class B extends A {
	B() {  }
}

public class TypeTest2 {

	public static void main(String[] args) {
		
		// 실행 가능
		// 부모 클래스의 참조 변수로 자식 클래스의 객체를 참조할 수 있음
		A a = new B();
		
	}

}
