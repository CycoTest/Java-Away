package oop1;

public class TV {
	String color;
	boolean power;
	private int channel;
	
	public void power() {
		power = !power;
	}

	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
	public int setChannel(int channel) {
		if (channel >= 1 && channel <= 100) {
			this.channel = channel;
		} else {
			System.out.println("잘못된 채널 번호입니다.");
		}
		return this.channel;
	}
	
	public int getChannel() {
		return channel;
	}
}
