package OOP_0316;

public class Circle {
	
	private int radius;
	// Point_270p 참조 변수가 필들 선언되어 있음
	private Point_270p center;
	
	
	// 생성자
	public Circle(Point_270p p, int r) {
		center = p;
		radius = r;
	}
	
	@Override
	public String toString() {
		return "Circle [radius = " + radius + ", center = " + center  + "]";
	}
	
}
