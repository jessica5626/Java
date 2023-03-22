package OOP_0317;

public class ArrayProcTest {

	public static void main(String[] args) {
		
		int[] list = { 1, 2, 3, 4, 5 };
		ArrayProc obj = new ArrayProc();
		
		// inc() 메소드 안에서 배열의 내용을 변경하면 원본 배열의 내용도 변경됨
		obj.inc(list);
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}

	}

}
