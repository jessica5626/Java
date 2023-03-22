package OOP_0317;

public class Box_279p {
	int width, length, height;
	int volume;
	
	Box_279p(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}
	
	// 객체를 반환하고 있음, 즉 2개의 박스 중에서 큰 박스 객체를 반환하고 있ㅇ므
	Box_279p whosLargest(Box_279p box1, Box_279p box2) {
		if(box1.volume > box2.volume) {
			return box1;
		}
		else {
			return box2;
		}
	}
}
