package OOP_0316;

public class CircleTest {

	public static void main(String[] args) {
		
		Point_270p p = new Point_270p(25, 78);
		
		// Circle 객체를 생성할 때, Point_270p 객체 참조 값을 넘김
		Circle c = new Circle(p, 10);
		
		System.out.println(c);

	}

}
