package ex04_ReferenceReturn;

class Data {
	int x;
}

public class ReferenceRetun1 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d);
//		copy(d) : copy 메소드에 d의 주소값을 입력
		System.out.printf("d.x = %d\n", d.x);
		System.out.printf("d2.x = %d\n", d2.x);
	}

	static Data copy(Data d) {
		Data tmp = new Data(); // 새로운 객체 tmp 생성
		tmp.x = d.x; // d.x의 값을 tmp.x에 복사

		return tmp; // 복사한 객체의 주소를 반환
	}
//	리턴타입이 참조형이라는 것은, 메소드가 '객체의 주소'를 리턴한다는 것을 의미
}
