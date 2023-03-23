package OOP_0323;

public class SportsCarTest {

	public static void main(String[] args) {
		
		// 자식 클래스 객체 생성
		
		// 부모 클래스의 필드와 메서드 사용
		SportsCar obj = new SportsCar();
		obj.speed = 10;
		obj.setSpeed(60);
		
		// 자체 메서드 사용
		obj.setTurbo(true);

	}

}
