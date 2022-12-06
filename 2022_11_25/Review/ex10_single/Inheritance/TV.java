package ex10_single.Inheritance;

public class TV {
	boolean power;
	int channel;

	void power() {
		if (power) {
			System.out.println("Power On");
		} else if (!power) {
			System.out.println("Power Off");
		}
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}