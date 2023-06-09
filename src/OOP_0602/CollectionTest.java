package OOP_0602;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("배석민");
		names.add("박종성");
		names.add("명재현");
		names.add("김현우");
		names.add("이재현");
		names.add("한유진");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(23);
		ages.add(22);
		ages.add(21);
		ages.add(20);
		ages.add(27);
		ages.add(17);
		
		for (int age : ages) {
			System.out.println(age);
		}
	}

}
