package OOP_0315;

public class Test {

	public static void main(String[] args) {
		
		/* 
		  자바 배열 선언 방법
		  int[] a;
		  int a[] = new int[10];
		*/
		
		/*
		  int[] a = null;			=> 주소값을 가지고 있지 않음
		  System.out.println(a[0]);	
		*/
		
		
		int[] a = new int [10];
		
		// System.out.println(a[0]);
		
		for(int i = 0; i <= 10; i++) {
			a[i] = i+1;
		}
		
		
	}

}
