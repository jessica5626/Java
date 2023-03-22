package OOP_0317;

public class Box_282p {
	private int width, length, height;
	
	Box_282p(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox(Box_282p obj) {
		if((obj.width == width) & (obj.length == length) & (obj.height == height)) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
