package OOP_0303;

public class CarTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car();
		
		// 객체의 메소드 호출
		myCar.changeGear(1);
		myCar.speedUp();
		
		// toString() 호출
		System.out.println(myCar);

	}

}
