package OOP_0317;

public class MyCounterTest2 {

	public static void main(String[] args) {
		
		MyCounter2 obj = new MyCounter2();
		
		System.out.println("obj.value = " + obj.value);
		obj.inc(obj);
		// inc() 메소드 안에서 전달된 객체의 내용을 변경하면 원본 객체의 내용도 변경됨
		System.out.println("obj.value = " + obj.value);

	}

}
