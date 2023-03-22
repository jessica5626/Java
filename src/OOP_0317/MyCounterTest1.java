package OOP_0317;

public class MyCounterTest1 {

	public static void main(String[] args) {
		
		MyCounter1 obj = new MyCounter1();
		int x = 10;
		
		// inc() 메소드로 변수 x의 복사본이 전달되기 때문에 inc()는 x의 값에 영향 X
		obj.inc(x);
		System.out.println("x = " + x);
		
	}

}
