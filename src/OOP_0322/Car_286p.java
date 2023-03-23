package OOP_0322;

public class Car_286p {
	
	private String model;
	private String color;
	private int speed;
	
	// 자동차의 시리얼 번호
	private int id;
	// 생성된 Car 객체의 개수를 위한 정적 변수
	static int numbers = 0;
	
	public Car_286p(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		
		// 자동차의 개수를 증가하고 id에 대입
		id = ++numbers;
	}
	
	
}
