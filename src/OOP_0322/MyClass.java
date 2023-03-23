package OOP_0322;

public class MyClass {
	// 정적변수
	static int x;
	int y;
	
	// 정적 초기화 블록
	static {
		x = 10;
		System.out.println("정적 블록이 호출되었음! ");
	}
}
