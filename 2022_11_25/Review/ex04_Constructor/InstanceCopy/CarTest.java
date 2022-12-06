package ex04_Constructor.InstanceCopy;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);

		System.out.printf("c1의 color=%s, gearType=%s, door=%d\n",
				c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d\n",
				c2.color, c2.gearType, c2.door);

		c1.door = 100;
		System.out.println("c1.door=100; 수행 후");

		System.out.printf("c1의 color=%s, gearType=%s, door=%d\n",
				c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d\n",
				c2.color, c2.gearType, c2.door);
	}
}
