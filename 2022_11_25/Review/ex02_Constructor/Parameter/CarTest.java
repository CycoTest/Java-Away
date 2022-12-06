package ex02_Constructor.Parameter;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Car c2 = new Car("white", "auto", 4);
		System.out.printf("c1의 color=%s, gearType=%s, door=%d", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d", c2.color, c2.gearType, c2.door);
	}

}
