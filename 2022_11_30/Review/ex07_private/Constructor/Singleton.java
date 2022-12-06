package ex07_private.Constructor;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}

		return s;
	}
}
/*
 * 제한된 개수의 인스턴스를 생성하기 위해 만드는 코드
 * 
 * 위의 코드는 단 하나의 인스턴스를 생성하기 위한 코드로
 * 	Singleton 패턴이라고 부른다
 * 
 * 만약 여러 개의 인스턴스를 생성하고 싶다면 어떻게 해야 할까?
 * 	-> 아주 간단하게 멤버 변수를 여러 개 선언하고
 * 		그거에 따른 if절 조건문에 추가해주면 된다
 * 
 */
