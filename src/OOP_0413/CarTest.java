package OOP_0413;

// import test.Box;

public class CarTest {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		
//		Class classVar = car.getClass();
//		System.out.println(classVar.getName());
//		
//		System.out.println("브랜드 : " + car.brand + "모델은 : " + car.model);
		
		Car car1 = new Car(new String("현대"), new String("그랜져"));
		Car car2 = new Car("현대", "그랜져");
		
		System.out.println(car1.equals(car2));
		// false 출력
		// => equals()는 메모리 주소를 비교하기 때문
		
		System.out.println(car1 == car2);
		
		// 모든 참조변수는 null값을 가질 수 있음
		// 
		Car car3 = null;
		System.out.println(car1.equals(car3));
		
	
		/* test.Box box = new test.Box(10, 20, 30);
		   
		   Box box = new Box(10, 20, 30);
		   => 위에서 test 클래스의 Box를 import 했기 때문에
		   	  굳이 위 코드처럼 안적어도 불러올 수 있음
		   
		   System.out.println(car1.equals(box));
		*/
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
