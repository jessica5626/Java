package OOP_0322;

public class OuterClass {
	private int value = 10;
	
	// 내부 클래스
	// 내부 클래스 안에서는 외부 클래스의 private 변수들을 참조할 수 있음
	class InnerClass {
		public void myMethod() {
			System.out.println("외부 클래스의 private 변수 값 : " + value);
		}
	}
	
	OuterClass() {
		// 내부 클래스를 사용
		InnerClass obj = new InnerClass(); 
		obj.myMethod();
	}
}
