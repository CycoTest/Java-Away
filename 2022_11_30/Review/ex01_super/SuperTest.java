package ex01_super;

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.printf("x= %d\n", x);
		System.out.printf("this.x= %d\n", this.x);
		System.out.printf("super.x= %d\n", super.x);
	}
}

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		
		c.method();
	}
}
