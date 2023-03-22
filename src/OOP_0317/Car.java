package OOP_0317;

public class Car {
	
	private int speed;
	private String name;
	
	public Car() {
		System.out.println("속도는 " + speed);
	}
	
	// 인스턴스 초기화 블록(instance initialization block)을 통해서 초기화 할 수 있음
	// 초기화 블록을 사용해서 공통적으로 필요한 초기화 코드를 초기화 할 수 있음
	{
		speed = 100;
	}
	
	public Car(String name) {
		this.name = name;
		System.out.println("속도는 = " + speed);
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("그랜져");
		
	}

}
