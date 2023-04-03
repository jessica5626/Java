package OOP_0331;

// 각 도형들은 2차원 공간에서 도형의 위치를 나타내는 기준점(x, y)을 가짐
// 이것은 모든 도형에 공통적인 속성이므로 부모 클래스인 Shape에 저장
class Shape {
	protected int x, y;
	
	public void draw() {
		System.out.println("Shape Draw");
	}
}

// Shape에서 상속받아 사각형을 나타내는 클래스 Rectangle을 정의
// Rectangle은 추가적으로 width와 height변수를 가짐
class Rectangle extends Shape {
	private int width, height;
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape {
	private int base, height;
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape {
	private int radius;
	
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest {
	
	public static void main(String arg[]) {
		
		Shape s1, s2, s3, s4;
		
		// 1. 당연하다
		s1 = new Shape();
		// 2. Rectangle 객체를 Shape 변수로 가리킬 수 있을까?
		// => 부모 클래스 참조 변수로 자식 클래스 객체를 참조할 수 있음. 이것을 상향 형변환이라고 함
		s2 = new Rectangle();
		s3 = new Triangle();
		s4 = new Circle();
		
		// 부모 클래스의 참조변수로 자식 클래스의 객체를 가리키는 것은 합법적
		// Shape s = new Rectangle();
		// Rectangle r = new Rectangle();
		
		// Shape 클래스의 필드와 메소드에 접근하는 것은 OK
		// s.x = 0;
		// s.y = 0;
		
		// 컴파일 오류가 발생
		// => s를 통해서는 Rectangle 클래스의 필드와 메소드에 접근할 수 없음
		// s.width = 100;
		// s.height = 100;
		
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}
}
