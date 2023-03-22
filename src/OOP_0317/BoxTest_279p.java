package OOP_0317;

public class BoxTest_279p {

	public static void main(String[] args) {
		
		Box_279p obj1 = new Box_279p(10, 20, 50);
		Box_279p obj2 = new Box_279p(10, 30, 30);
		
		Box_279p largest = obj1.whosLargest(obj1, obj2);
		System.out.println("(" + largest.width + "," + largest.length + "," + largest.height + ")");

	}

}
