package tv;

public class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}
// 멤버 변수 3개, 메서드 3개인 클래스