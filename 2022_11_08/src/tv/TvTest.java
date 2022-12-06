package tv;

public class TvTest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();

		System.out.print("현재 채널은 " + t.channel + " 입니다.");
	}
}
/*
 *  변수
 *  	- 지역 변수 : 메서드 내에서만 유효한 값을 갖는 변수
 *  			즉, 해당 메서드를 벗어나면 변수값은 모른다
 *  	- 멤버 변수 : 클래스 내에서만 유효한 값을 갖는 변수
 *  			즉, 해당 클래스를 벗어나면 변수값올 모른다
 */

// 하나의 자바 파일에 하나의 클래스만 넣는 걸 되도록이면 권장