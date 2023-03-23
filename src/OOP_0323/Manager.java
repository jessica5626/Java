package OOP_0323;

public class Manager extends Employee {


	public static void main(String[] args) {
		
		private int bonus;
		
		public Manager(String name, String address, int salary, int rrn, int bonus) {
			super(name, address, salary, rrn);
			this.bonus = bonus;
		}
		
		void test() {
			System.out.println("name = " + name);
			System.out.println("address = " + address);
			System.out.println("salary = " + salary);
			
			// 자식 클래스에서 부모 클래스의 private 필드는 접근할 수 없음
			// System.out.println("rrn = " + rrn);
		}

	}

}
