package ex07_private.Constructor;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		생성자 Singleton의 접근 제어자가 private으로 되어있는 탓에
//		"The constructor Singleton() is not visible"이라는 에러 메세지가 뜸 
		
		Singleton s2 = Singleton.getInstance();
	}

}
