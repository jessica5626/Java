package OOP_0303;

public class Television {

		int channel;		// 채널 번호
		int volume;			// 볼륨
		boolean onOff;		// 전원 상태
		
		void print() {
			System.out.println("채널은 " + channel + "이고 볼륨은 " + 
				volume + "입니다.");
		}
		
		int getChannel() {
			return channel;
		}
		
		// 매개변수를 가지는 메소드
		void setChannel(int ch) {
			channel = ch;
		}

	public static void main(String[] args) {

		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 "
				+ tv.volume + "입니다.");

	}

}
