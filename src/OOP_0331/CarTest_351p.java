package OOP_0331;

public class CarTest_351p {
	public static void main(String[] args) {
		
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		// 2개의 자동차가 동일한 모델이면 같다고 판단함
		if(firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		}
		else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
		
	}

}
