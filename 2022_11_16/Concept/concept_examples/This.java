package concept_examples;
public class This {
	String model;
	int speed;

	This(String model) {
		this.model = model;
//		this가 붙어서 This class의 멤버 변수인 String타입의 model로 간다
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i); // this가 생략된 setSpeed(i);로 해도 실행하는데 아무 문제 없다
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}

	public static void main(String[] args) {
		This car1 = new This("Hyundai");
		This car2 = new This("BMW");

		car1.run();
		car2.run();
	}
}
/*
 * this.메소드 => 자기 자신 클래스의 메소드 호출
 * this() => 자기 자신 클래스의 생성자 호출
 * 
 * super.메소드 => 부모 클래스의 메소드 호출
 * super() => 부모 클래스의 생성자 호출
 */

