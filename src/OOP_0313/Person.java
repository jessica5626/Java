package OOP_0313;

public class Person {
	/*
	 * member variable은 특별한 이유가 없는 한 private로 만들어라.
	 * 그 member variable을 클래스 외부에서 접근해야 한다면 그를 위한
	 * method를 public으로 구현하라.
	 * 예를 들어, myAge라는 member variable에 값을 설정해야 하는 메소드는
	 * setAge로, myAge라는 member variable의 값을 읽어오는 메소드는 getAge로
	 * public 접근제어 지정자를 명시하여 구현하면 된다.
	 * 이렇게 함으로써 member variable에 잘못된 값이 설정되는 것을 막을 수도 있고
	 * 향후에 그 클래스를 버전업하면서 member variable의 이름을 변경해도
	 * 그 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.
	 */
	// ★ 모든 member variable은 특별한 이유가 없는 한 private.

	
	/*
	 * 접근 제어 지정자 (access modifier)
	 *  : public, protected, default, private
	 * public이 명시된 member (variable | method) 그 클래스 내부, 외부 어느 곳에서든
	 * 접근 가능하다.
	 * protected가 명시된 member는 그 클래스 내부, 그리고 그 클래스의 자식, 그리고
	 * 그 클래스와 같은 패키지에 속한 다른 클래스에서도 접근 가능하다.
	 * 접근 제어 지정자가 명시되지 않은 경우, 이를 default 접근 제어 지정자다 라고 한다.
	 * default 접근 제어 지정자가 명시된 member는 그 클래스 내부, 그리고 그 클래스와 같은 
	 * 패키지에 속한 다른 클래스에서도 접근 가능하다.
	 */
	// ★ protected와 default 차이 : 자식에서 접근 가능한가
	
	/*
	 멤버 변수를 private로 설정하는 이유
	 1. 잘못된 값을 설정하는 것을 막아줄 필요가 있다.
	 2. 읽기전용 멤버 변수로 만들 수 있다.
	 3. 클래스 소스코드를 업그레이드 할 경우, 그 클래스를 사용하는 다른 코드에
	 	미치는 영향을 최소화 할 수 있다.
	*/
	
	
	// private String name;
	
	/* 멤버변수를 private으로 해놓고 public을 값을 읽어오는 걸로 만들면 
	   읽기전용 메서드가 됨 
	   (값을 설정해주는 public 메서드 없음) 
	*/
	private String name = "홍길동";	// 읽기 전용 메서드 
	
	// int age;
	// private int age;
	
	private int myAge;
	// private String dept = "컴정";	// 읽기 전용 메서드
	
	
	// private으로 바꾸는 순간 PersonTest 클래스 내에 있는 p.dept 빨간줄
	protected String dept = "컴정"; 
	
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setAge(int age) {
//		 if(age >= 0 && age <= 150) {
//		 	this.age = age;
//			System.out.println("나이의 범위는 0부터 150까지 입니다.");
//		}
		
		if (myAge >= 0 & myAge <= 150) {
			this.myAge = age;
			System.out.println("나이의 범위는 0부터 150까지 입니다.");
		}
	}

	private void test() {
		System.out.println(name);
	}
	
	public int getAge() {
		// return age;
		return myAge;
	}
	
}
