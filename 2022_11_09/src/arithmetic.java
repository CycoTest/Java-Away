public class arithmetic {
	public static void main(String[] args) {
		int i = 10;
		float f = 20.0f;
		float result1 = f + (float) i;
//		int result2 = f + i;
//		f + i;에서 에러 메세지가 뜨는 이유: 
//		우항 연산에서 자동으로 float 변수 f의 범위에 강제 복속되는데,
//		좌항의 변수의 범위는 int라, 좌우의 데이터 범위가 일치하지 않아 발생
		
		double d = 12.3;
		int result3 = (int)(i + d);
//		i + d 연산에선 범위가 상대적으로 더 큰 double 타입의 범위로 복속됨
//		앞에 int 타입을 강제로 넣음으로써, 값의 범위를 강제로 4바이트짜리인 int 타입으로 변환
//		이런 걸 '명시적 타입 캐스팅'이라고 함
		double result4 = i + d;
	}
}
/*
 * 산술(arithmetic) 변환
 * 	1) 두 피연산자의 타입을 같게 일치시킴 (보다 큰 타입으로 일치)
 * 		- long + int --> long + long ---> long
 * 		- float + int --> float + float ---> float
 * 		- double + float --> double + double ---> double
 * 
 * 	2) 피연산자의 타입이 int보다 작은 타입이면 int로 변환됨
 * 		- byte + short --> int + int ---> int
 * 		- char + short --> int + int ---> int
 * 
 * 단, 모든 연산에서 '산술 변환'이 일어나지만,
 * 	쉬프트 연산자(<<, >>), 증감 연산자(++, --)는 예외
 * 
 * 
 * 
 * 
 */
