package OOP_0602;

public class Test {

	public static void main(String[] args) {
//		IntBox ib1 = new IntBox();
//		ib1.setValue(10);
//		System.out.println(ib1.getValue());
//		
//		IntBox ib2 = new IntBox();
//		ib1.setValue(20);
//		
//		int result = ib1.getValue() + ib2.getValue();
//		System.out.println(result);
		
//		StrBox sb1 = new StrBox();
//		sb1.setValue("석민이는 ");
//		
//		StrBox sb2 = new StrBox();
//		sb2.setValue("귀엽고 예쁘다");
//		
//		String result = sb1.getValue() + sb2.getValue();
//		System.out.println(result);
//		
//		int idx = result.indexOf("예쁘다");
//		System.out.println(result.substring(idx));
		
//		Box b1 = new Box();
//		b1.setValue(20);
//		
//		Box b2 = new Box();
//		b2.setValue(30);
//		
//		int result = (int)b1.getValue() + (int)b2.getValue();
//		System.out.println(result);
		
		Box strBox = new Box();
		strBox.setValue("석민이는 예쁘고 귀엽고 착하다!");
		Object v = strBox.getValue();
		int idx = ((String)v).indexOf("착하다");
		System.out.println(((String)v).substring(idx));
		
		int val = (int)strBox.getValue();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
