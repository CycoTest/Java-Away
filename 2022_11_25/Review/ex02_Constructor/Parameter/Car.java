package ex02_Constructor.Parameter;

public class Car {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수

	Car() {

	}

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
