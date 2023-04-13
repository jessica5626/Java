package OOP_0413;

public class Car {
	
	String brand;
	String model;
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public Car() {
		this("Unknown", "Unknown");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		// obj가 Car 클래스의 인스턴스가 아니면 바로 false를 반환하자.
		// 자바에는 이 목적으로 사용할 수 있는 연산자가 있다.
		// instanceof 가 있다.
		// 연산자 사용 예 : 3+4 0, +(3, 4) X
		if (obj instanceof Car == false) return false;
		
		// obj는 Car 클래스의 객체라 가정한다.
		// 그래야, Car 클래스의 인스턴스의 brand, model 멤버에 접근할 수 있다.
		// 하향 형변환
		Car yourCar = (Car)obj;
		if (yourCar.brand.equals(brand) && yourCar.brand.equals(model)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* 상속은 IS-A 관계일 때 
	   Car is a Vehicle
	   Bicycle is a Vehicle
	   Airplane is a Vehicle
	*/
	
	/*   HAS-A 관계일 때
	   Car has a Engine
	   
	   public calss Engine {}
	   
	   public class Car {
		   private Engine engine;
		   private String brand;
		   private String model;
		   ...
	   }
	*/
	

}
