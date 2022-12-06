package oop1;

public class TV_Test1 {
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();

		System.out.printf("t1의 channel값은 %d입니다.\n", t1.getChannel());
		System.out.printf("t2의 channel값은 %d입니다.\n", t2.getChannel());

		t1.setChannel(7);

		System.out.printf("t1의 channel값은 %d입니다.\n", t1.getChannel());
		System.out.printf("t2의 channel값은 %d입니다.\n", t2.getChannel());
	}
}
