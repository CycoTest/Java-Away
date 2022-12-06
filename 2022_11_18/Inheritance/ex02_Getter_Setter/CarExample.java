package ex02_Getter_Setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(-20);
		System.out.println("현재 속도 : " + myCar.getSpeed());

		myCar.setSpeed(40);
		System.out.println("현재 속도 : " + myCar.getSpeed());

		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
