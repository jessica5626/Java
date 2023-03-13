package OOP_0309;

public class StringClass {

	public static void main(String[] args) {
		
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println(proverb.length());
		s1 = proverb.concat("never Bites!");
		System.out.println(s1);
		
		
		proverb.replace('b', 'B');
		System.out.println(proverb);
		// A barking dog 출력
		// b가 B로 바뀌지 않음
		
		// 바뀌게 하려면 마찬가지로 객체를 새로 생성해야 함		
		s2 = proverb.replace('b', 'B');
		System.out.println(s2);
		// A Barking dog 출력
		
		s3 = proverb.substring(2, 3);
		System.out.println(s3);
		
		s4 = proverb.toUpperCase();
		
		int x = 20;
		System.out.println("결과값은 " + x);
		
		System.out.println("100" + x);
		System.out.println(100 + x);
		
		String s = "1234";
		int n = Integer.parseInt(s);
		System.out.println(n);
		
		double d = Double.parseDouble(s);
		
		Float.parseFloat(s);
		
		Long.parseLong(s);
		
	}

}
