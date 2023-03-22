package OOP_0317;

public class Box {
	
	private int width, length, height;
	// private int volume;
	public Box(int w, int len, int h) {
		
		width = w;
		length = len;
		height = h;
		
		// volume = width * length * height;
	}
	
	//getVolume 메서드는 내부적으로만 사용하기 때문에 private으로 만듦
	private int getVolume() {
		return width * length * height;
	}
	
	public static Box whoisLargerBox(Box box1, Box box2) {
		if(box1.getVolume() > box2.getVolume()) {
			return box1;
		}
		// box2가 리턴되는 경우: box1보다 같거나 클 때
		return box2;
	}
	
	public static void main(String[] args) {
		
		Box b1 = new Box(10, 20, 50);
		Box b2 = new Box(10, 30, 50);
		System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
		System.out.println("두 번째 박스의 부피 : " + b2.getVolume());
		
		Box largerBox = Box.whoisLargerBox(b1, b2);
		Box.whoisLargerBox(b1, b2);
		System.out.println("더 큰 박스의 부피 : " + largerBox.getVolume());

	}

}
