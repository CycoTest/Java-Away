package ex08_polymorphism;

public class CastingTest {
	public static void main(String[] args) {
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = fe;
//		car.water();
//		The method water() is undefined for the type Car;
		
		fe2 = (FireEngine)car;
		fe2.water();
	}

}
