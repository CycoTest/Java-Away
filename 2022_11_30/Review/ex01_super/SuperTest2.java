package ex01_super;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	int x = 20;

	void method() {
		System.out.printf("x= %d\n", x);
		System.out.printf("this.x= %d\n", this.x);
		System.out.printf("super.x= %d\n", super.x);
	}
}

public class SuperTest2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
