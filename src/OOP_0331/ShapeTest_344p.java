package OOP_0331;

public class ShapeTest_344p {
	
	// Shape에서 파생된 모든 클래스의 객체를 다 받을 수 있음
	public static void printLocation(Shape s) {
		System.out.println("x = " + s.x + " y = " + s.y);
	}
	
	public static void main(String[] args) {
		
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		printLocation(s1);
		printLocation(s2);
		printLocation(s3);

	}

}
