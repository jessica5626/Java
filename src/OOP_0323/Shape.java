package OOP_0323;

public class Shape {
	private int x;
	private int y;
	
	// 접근자와 설정자
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	void print() {
		System.out.println("X좌표 : " + x + " Y좌표 : " + y);
	}
}
