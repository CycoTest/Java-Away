package ex06_instanceof;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		if (parent instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (parent instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (child instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (child instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}	
	}
}
