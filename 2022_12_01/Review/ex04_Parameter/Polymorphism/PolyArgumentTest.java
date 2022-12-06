package ex04_Parameter.Polymorphism;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new TV());
		b.buy(new Computer());

		System.out.printf("현재 남은 돈은 %d만원입니다.\n", b.money);
		System.out.printf("현재 보너스 점수는 %d점입니다.\n", b.bonusPoint);
	}
}
