package OOP_0317;

public class ArrayProcTest_278p {
	final static int STUDENTS = 5;
	public static void main(String[] args) {
		
		int[] scores = new int[STUDENTS];
		ArrayProc_278p obj = new ArrayProc_278p();
		obj.getValues(scores);
		System.out.println("평균은 = " + obj.getAverage(scores));
		

	}

}
