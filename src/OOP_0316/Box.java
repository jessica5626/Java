package OOP_0316;

public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	// 부피 계산 메서드
	public int getVolume() {
		return volume;
	}
	
	// 생성자
	Box (int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = width * length * height;
	}
}
