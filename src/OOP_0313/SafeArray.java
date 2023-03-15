package OOP_0313;

public class SafeArray {
	
	// 변수만 선언됨 (어떠한 메모리도 가르키고 있지 않음)
	private int a[];
	
	public int length;
	
	
	// 배열값 지정 메서드
	public SafeArray(int size) {
		
		a = new int[size];
		length = size;
		
	}
	
	// 특정 index값을 읽어오는 메서드
	public int get(int index) {
		
		// 이 index가 배열 크기 안에 있는 index인지 체크
		if(index >= 0 && index < length) {
			return a[index];
		}
		
		// -1은 저 배열에 들어갈 수 없다는 가정 하에 지정
		return -1;
		
	}
	
	// 값을 설정하는 메서드
	public void put(int index, int value) {
		
		if(index >= 0 && index < length) {
			a[index] = value;
		}
		
		else {
			System.out.println("잘못된 인덱스 " + index);
		}
		
	}
	
}
