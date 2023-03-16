package OOP_0316;

public class MyCounterTest {

	public static void main(String[] args) {
		
		
		// 생성자가 호출 됨
		MyCounter obj1 = new MyCounter();
		
		MyCounter obj2 = new MyCounter();
		System.out.println("객체 1의 counter = " + obj1.counter);
		System.out.println("객체 2의 counter = " + obj2.counter);
		
		
		// 생성자가 매개변수를 가짐
		MyCounter obj3 = new MyCounter(100);
		MyCounter obj4 = new MyCounter(200);
		
		System.out.println("객체 3의 counter = " + obj3.counter);
		System.out.println("객체 4의 counter = " + obj4.counter);

	}

}
