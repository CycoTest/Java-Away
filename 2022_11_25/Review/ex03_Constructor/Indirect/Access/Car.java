package ex03_Constructor.Indirect.Access;

public class Car {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수

	Car() {
		this("white", "auto", 4);
	}

	Car(String color) {
		this(color, "auto", 4);
		door = 5;
	}
//	생성자에서 다른 생성자 호출하기: this(), this
//	생성자명으로 클래스명 대신 this를 사용
//	한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능

	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
