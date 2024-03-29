package OOP_0427;

public class SamsungTV implements AdvancedRemoteControl {

	@Override 
	public void turnOn() {
		System.out.println("삼성 티비를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("삼성 티비를 끕니다.");
	}
	
	@Override
	public void volumeControl(int amount) {
		String st = null;
		st = amount >= 0 ? "높입니다." : "줄입니다.";
		amount = Math.abs(amount);
		System.out.println("볼륨을 " + amount + " 만큼 " + st);
	}
	

}
