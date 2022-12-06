public class OperatorEx04_type_absorb {
	public static void main(String[] args) {
		short s = 100;
/* 좌항에 short 타입, 우항에 int 타입으로 변환하려는 것

보수의 개념을 알고 있으면 이해 가능

-s = -100 의 값은 100의 2진법 수와 다르다
즉, -100은 short 타입의 범위에 담을 수 없을 만큼 크다
따라서, -100의 2진법은 디폴트 타입인 int 타입으로 저장되기에,
int 타입의 범위가 short 타입의 범위보다 훨씬 크기 때문에 컴파일 오류가 나온다

 */
		int result2 = -s;
		
		System.out.println(s);
		System.out.println(result2);
	}

}
