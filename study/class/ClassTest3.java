class TV { //클래스의 메소드 안에 모두공유
	boolean power;
	int channel;
	int size =50;
	
	void onOff() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	String info() {
		return String.format("사이즈 : %s, 채널 : %s  전원 : %s", size, channel, (power)? "on":"off" );
			
	}
}



public class ClassTest3 {

	public static void main(String[] args) {
		TV tv = new TV();
		System.out.println(tv.info());
		tv.onOff();
		System.out.println(tv.info());
		tv.channelDown();
		System.out.println(tv.info());
	}

}
