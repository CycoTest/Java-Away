package ex03_Constructor.Indirect.Access;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");

		System.out.printf("c1의 color=%s, gearType=%s, door=%d\n", 
				c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d\n", 
				c2.color, c2.gearType, c2.door);
	}
}
