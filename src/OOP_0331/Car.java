package OOP_0331;

public class Car {
	
	private String model;
	
	public Car(String model){
		this.model = model;
	}
	
	// equals()를 재정의함
	// String의 equals()를 호출하여서 문자열이 동일한지 검사함
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			return model.equals(((Car) obj).model);
		}
		else {
			return false;
		}
	}
}
