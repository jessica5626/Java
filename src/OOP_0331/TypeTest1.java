package OOP_0331;

class A {
	A() {  }
}

class B {
	B() {  }
}

public class TypeTest1 {

	public static void main(String[] args) {
		
		// 에러 발생
		// 클래스 A의 참조 변수로 클래스 B의 객체를 참조할 수 없음
		A a = new B();

	}

}
