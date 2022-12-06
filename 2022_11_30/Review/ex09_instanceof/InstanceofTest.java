package ex09_instanceof;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}

		if (fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}

		if (fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}

		System.out.println(fe.getClass().getName());
//		참조변수.getClass().getName()
//		참조 변수가 가리키고 있는 인스턴스의 클래스이름을 문자열(String)로 반환해주는 메소드다
	}
}
