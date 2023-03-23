package OOP_0322;

public class CarTest_286p {

	public static void main(String[] args) {
		
		// 생성자 호출
		Car_286p c1 = new Car_286p("S600", "white", 80);
		// 생성자 호출
		Car_286p c2 = new Car_286p("E500", "blue", 20); 
		// 정적 변수
		int n = Car_286p.numbers;
		
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
	}

}
