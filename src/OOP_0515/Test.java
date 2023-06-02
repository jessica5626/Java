package OOP_0515;

public class Test {

	public void test(MyInterface1 m1) {
		m1.print("Hello World");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
//		1. 무명 클래스를 이용해 Test 클래스의 인스턴스 메소드 test 호출하시오.
//		t.test(new MyInterface1() {
//			public void print(String s) {
//				System.out.println(s);
//			}
//		});
//		2. 람다를 이용해 Test 클래스의 인스턴스 메소드 test 호출하시오.
//		인터페이스인데 오직 하나의 추상 메소드를 가지는 인터페이스는
//		람다로 구현할 수 있다.
//		t.test((s)->{System.out.println(s);});
		int r = sum(100, 200, 105, (n1, n2) -> n1 + n2);
		System.out.println(r);
	}
	
	public static int sum(int n1, int n2, int n3, Add add) {
		int result = add.add(n1, n2);
		result = add.add(result, n3);
		System.out.println(result);
		return result;
	}
}

interface Add {
	int add(int n1, int n2);
}
