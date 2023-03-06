package OOP_0303;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television myTv = new Television();
		myTv.setChannel(11);
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 "
				+ myTv.volume + "입니다.");
		System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 "
				+ yourTv.volume + "입니다.");

	}

}
