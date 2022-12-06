package ex05_Anonymous;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
