package ex08_final;

public class SportsCar extends Car {
	public void speedUp() {
		speed += 10;
	}

//	public void stop() {
//		Cannot override the final method from Car class
//		System.out.println("SportsCar를 멈춤");
//		speed = 0;
//	}
}
