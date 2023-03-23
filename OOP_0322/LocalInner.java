package OOP_0322;

public class LocalInner {

	class localInner {
		// 인스턴스 변수
		private int data = 30;
		
		void display() {
			final String msg = "현재의 데이터값은 ";
			
			// 메서드 display() 안에 클래스 Local이 정의되어 있음
			// 지역 클래스는 메서드 안에서만 사용이 가능
			// 외부 클래스의 private 변수에 접근할 수 있음
			class Local {
				void printMsg() {
					System.out.println(msg + data);
				}
			}
			Local obj = new Local();
			obj.printMsg();
		}
	}
	
	public class localInnerTest {
		public static void main(String args[]) {
			localInner obj = new localInner();
			obj.display();
		}
	}
	

}
