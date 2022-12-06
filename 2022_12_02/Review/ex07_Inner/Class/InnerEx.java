package ex07_Inner.Class;

public class InnerEx {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // 외부 클래스의 private 멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv = outerIv; // static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;  // JDK 1.8부터 final 생략 가능
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // 외부 클래스의 지역 변수는 final이 붙은 변수(상수)만 접근 가능
			int liv4 = LV;
		}
	}
}
