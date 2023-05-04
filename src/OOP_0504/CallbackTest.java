package OOP_0504;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;

public class CallbackTest {

	
	public static void main(String[] args) {
		
		ActionListener listener = new MyClass();
		// MyClass listener = new MyClass();
		Timer timer = new Timer(1000, listener);
		timer.start();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Press Enter to quit!");
		input.nextLine();
		input.close();
		System.out.println("프로그램을 종료합니다~!!");

	}
}

class MyClass implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Beep");
	}
}
