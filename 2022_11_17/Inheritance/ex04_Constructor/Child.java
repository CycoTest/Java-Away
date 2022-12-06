package ex04_Constructor;

public class Child extends Parent {
	public int ChildNo;

	Child(String name, String ssn, int childNo) {
		super(name, ssn);
//		super : 부모 클래스의 생성자를 호출하게 해줌
//		super(name, ssn) : 부모 클래스의 생성자 중 파라미터가 String, String인 생성자를 호출
		this.ChildNo = childNo;
	}
}
