package ex04_Class.Class;

public class ClassInfoEx {
	public static void main(String[] args) {
		Car car = new Car(100);
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}
