package OOP_0322;

public class Car_288p {
	
	private String model;
	private String color;
	private int speed;
	
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numbers = 0;
	
	public Car_288p(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		// 자동차의 개수를 증가하고 id에 대입
		id = ++numbers;
	}
	
	// 정적 메소드
	// 정적 메소드에서는 인스턴스 변수와 인스턴스 메소드에 접근할 수 없음
	public static int getNumberOfCars() {
		return numbers;
	}
}
