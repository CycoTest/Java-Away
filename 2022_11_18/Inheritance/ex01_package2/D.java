package ex01_package2;

import ex01_package1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
/*
 * protected가 걸려있는 A 클래스는 같은 패키지 내에 생성된 파일들은 접근이 가능하지만,
 * 다른 패키지에 있는 파일들은 portected가 걸려있는 A 클래스한테 접근할 수 없다
 * 
 * 하지만, import 키워드를 이용하면 동일한 패키지가 아님에도
 * A 클래스를 불러올 수 있다
 * 
 * 이렇게 하면 패키지가 다름에도 상속이 가능해진다.
 */

