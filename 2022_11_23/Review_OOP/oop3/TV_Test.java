package oop3;

import oop1.TV;

public class TV_Test {
	public static void main(String[] args) {
		TV tvArr[] = new TV[3];

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new TV();
			tvArr[i].setChannel(i + 10);
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d] =  %d\n", i, tvArr[i].getChannel());
		}
	}
}
