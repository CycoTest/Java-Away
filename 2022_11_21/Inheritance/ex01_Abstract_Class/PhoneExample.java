package ex01_Abstract_Class;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone p2 = new Phone("홍길동");
//		추상 클래스는 실체가 없는 클래스
//		즉, 객체를 생성할 수 없는 클래스인 탓에 인스턴스를 생성할 수 없다
		
		Phone phone = new SmartPhone("홍길동");
		phone.turnOn();
//		phone.internetSearch();
		phone.turnOff();
//		부모 클래스에서 선언된 변수는 자식 클래스에서 인스턴스를 생성하더라도
//		활동 영역이 부모 클래스인 까닭에 자식 클래스에 선언된 메소드를 이용할 수 없다
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
