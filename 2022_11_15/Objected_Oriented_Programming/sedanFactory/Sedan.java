package sedanFactory;

import component.Tire;

public class Sedan {
	public static void main(String[] args) {
		Tire compoTire = new Tire();
		compoTire.setSize(20);
		
		System.out.println(compoTire.getSize());
	}

}
/*
 * 위 코드에서,
 * 
 * 멤버 변수 = 0개
 * 
 * 메소드 = 1개
 * 	-> main()
 * 생성자 = 0개
 * 
 */
