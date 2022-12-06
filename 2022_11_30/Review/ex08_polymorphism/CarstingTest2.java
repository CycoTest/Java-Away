package ex08_polymorphism;

public class CarstingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car;
		car2 = fe;
		car2.drive();
	}
}
