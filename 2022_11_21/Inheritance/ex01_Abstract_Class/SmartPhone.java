package ex01_Abstract_Class;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
