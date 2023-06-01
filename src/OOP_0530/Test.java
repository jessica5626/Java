package OOP_0530;
import java.time.LocalDate;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Person p1 = new Person("배석민", LocalDate.of(2001, 11, 30), "baeseokmin@gmail.com", Sex.FEMALE);
		Person p2 = new Person("홍길동", LocalDate.of(2000, 1, 4), "honggildong@gmail.com", Sex.MALE);
		Person p3 = new Person("일지매", LocalDate.of(1995, 2, 12), "iljimae@gmail.com", Sex.MALE);
		
		// List는 인터페이스, 이 인터페이스를 구현하는 클래스로
		// ArrayList, LinkedList 등이 있다.
		// ArrayList<Person> list = new ArrayList<Person>();
		// Person 타입의 객체를 원소로 가질 수 있는 리스트를 생성
		List<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		// 배석민 : 23세
		// 홍길동 : 24세
		// 일지매 : 29세
		
		// printPersonOlderThan(list, 21);
		// printPersonsWithinAgeRange(list, 28, 35);
		// CheckPersonMale18to25 cm = new CheckPersonMale18to25();
		// printPersons(list, cm);
		// printPersons(list, new CheckPersonMale18to25());
		// printPersons(list, new CheckPersonFemale20to30());
		
		// CheckPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
		// printPersons 메소드를 호출해라.
		// 단, 이 메소드에 의해 출력되는 Person 객체는 성별이 남자인 객체이어야 한다.
		// printPersons(list, new CheckPersonMale());
		
		// 위와 똑같이 성별이 남자인 객체만 출력하도록
		// printPersons 메서드를 호출하되, 무명클래스를 이용해봐라.
		// CheckPerson 인터페이스를 구현하는 무명클래스를 생성해 printPersons 메서드를 호출하면 된다.
		// 클래스 선언과(정의와) 객체생성을 동시에 할 수 있는 방법이 무명클래스 이잖아..
		printPersons(list, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				return p.getGender() == Sex.MALE;
			}
		});
		
		// 람다식은 이름없는 메소드라 할 수 있다.
		// 람다식을 이용하는 이유는 간결하기 때문이다.
		// 람다식을 이용하는 메소드가 필요한 곳에 간단히 메소드를 보낼 수 있다.
		// 람다식은 함수형 프로그래밍을 자바에 도입한 것이다.
		// 람다식은 오직 하나의 추상 메소드를 가지는 인터페이스 타입의 객체를 요구하는
		// 메소드의 인자로 전달될 수 있다.
		// 람다식의 문법 
		// (arg1, arg2, ...) -> { body }
		// (type1 arg1, type2 arg2, ...) -> { body }
		
		// 위의 무명클래스를 람다식으로 구현해보자.
		// printPersons(list, p -> p.getGender() == Sex.MALE);
		// printPersons(list, (Person p) -> { return p.getGender() == Sex.MALE; });
		
		// 람다식의 body가 return 문 하나만으로 구성되어 있으면 return 키워드, {}, 문장 끝의
		// 세미콜론(;)도 생략할 수 있다.
		// printPersons(list, (p) -> p.getGender() == Sex.MALE);
		
	}
	
	// collection framework : List, Set, Map, Stack, Queue
	// collection framework는 여러 개의 값을 저장하는 자바의 자료 구조
	// 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다.
	// List<Person>, Set<Integer>, Map<String, Person>, ....
	public static void printPersonOlderThan(List<Person> persons, int age) {
		
		// persons 리스트의 각 원소에 대해서 반복문을 수행한다.
		// 각 원소를 Person 타입의 변수 p에 저장.
		for(Person p : persons) {
			if(p.getAge() >= age) {
				p.printPerson();
				System.out.println();
			}
		}
	
	}

	// List<Person> list, int low, int high
	// 위 세 개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(Low 이상, high 미만)를
	// 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
	// printPersonsWithinAgeRange를 구현
	public static void printPersonsWithinAgeRange(List<Person> list, int low, int high) {
	
		for(Person p : list) {
			if(p.getAge() >= low && p.getAge() < high) {
				p.printPerson();
				System.out.println();
			}
		}
	
	}
	
	// Person 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체(tester라 하자)를 전달받고,
	// 리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 반환 값이 true이면
	// 그 Person 객체의 정보를 출력
	public static void printPersons(List<Person> list, CheckPerson tester) {
		for(Person p : list) {
			if(tester.test(p)) {
				p.printPerson();
				System.out.println();
			}
		}
	}
	
}

interface CheckPerson {
	boolean test(Person p);
}

class CheckPersonMale18to25 implements CheckPerson {
	public boolean test(Person p) {
		return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
	}
}

class CheckPersonFemale20to30 implements CheckPerson {
	public boolean test(Person p) {
		return p.getGender() == Sex.FEMALE && p.getAge() >= 20 && p.getAge() <= 30;
	}
}

class CheckPersonMale implements CheckPerson {
	public boolean test(Person p) {
		return p.getGender() == Sex.MALE;
	}
}
