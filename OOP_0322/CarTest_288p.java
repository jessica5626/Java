package OOP_0322;

public class CarTest_288p {

	public static void main(String[] args) {
		
		// 생성자 호출
		Car_288p c1 = new Car_288p("S600", "white", 80);
		// 생성자 호출
		Car_288p c2 = new Car_288p("E500", "blue", 20);
		// 정적 메소드 호출
		int n = Car_288p.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
	}

}
