package OOP_0323;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		// 부모 클래스의 메소드도 사용 가능
		r1.setX(5);
		r1.setY(3);
		r1.setWidth(10);
		r1.setHeight(20);
		
		r2.setX(8);
		r2.setY(9);
		r2.setWidth(15);
		r2.setHeight(20);
		
		r1.print();
		r1.draw();
		System.out.println("--------------------------------");
		r2.print();
		r2.draw();		
		
	}

}
