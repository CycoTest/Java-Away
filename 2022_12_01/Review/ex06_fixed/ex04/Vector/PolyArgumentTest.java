package ex06_fixed.ex04.Vector;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer com = new Computer();
		Audio au = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(au);
		b.summary();
		System.out.println();
		
		b.refund(com);
		b.summary();

//		System.out.printf("현재 남은 돈은 %d만원입니다.\n", b.money);
//		System.out.printf("현재 보너스 점수는 %d점입니다.\n", b.bonusPoint);
	}
}
