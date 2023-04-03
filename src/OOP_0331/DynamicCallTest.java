package OOP_0331;

class Animal {
	void sound() {
		System.out.println("Animal 클래스의 sound()");
	}
}

class Dog extends Animal {
	// 메소드 오버라이딩
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	// 메소드 오버라이딩
	void sound() {
		System.out.println("야옹");
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj;
		
		// 어떤 sound()가 호출될 것인지는 실행 시간에 참조되는 객체의 타입에 따라서 결정됨
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();

	}

}
