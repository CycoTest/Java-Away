package ex04_Constructor.InstanceCopy;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);
	}

	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
