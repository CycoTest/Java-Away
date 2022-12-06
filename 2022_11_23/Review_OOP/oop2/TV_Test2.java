package oop2;

import oop1.TV;

public class TV_Test2 {
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();

		System.out.printf("t1의 channel값은 %d입니다.\n", t1.getChannel());
		System.out.printf("t2의 channel값은 %d입니다.\n", t2.getChannel());

		t2 = t1;
		t1.setChannel(7);
		System.out.println("t1의 channel값을 7로 변경하셨습니다.");

		System.out.printf("t1의 channel값은 %d입니다.\n", t1.getChannel());
		System.out.printf("t2의 channel값은 %d입니다.\n", t2.getChannel());
	}
}
