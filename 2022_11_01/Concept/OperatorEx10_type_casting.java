public class OperatorEx10_type_casting {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		
		double result6 = (double) v1 / v2;
		// v1과 v2의 타입은 int이지만, 
		// double 타입을 적용함으로서 변수값이 정수가 아닌 실수가 나올 수 있게 해줌
		System.out.println("result6: " + result6);
	}
}
/*
암묵적 형변환 : 형 변환(type casting) 중 하나
	- 상황에 따라서 자동적으로 이뤄지는 형 변환을 암묵적 형변환이라 한다
		보통 크게 3가지로 나눠진다
		ㄱ. 대입연산시 발생하는 경우
		ㄴ. 정수의 연산시 발생하는 경우
		ㄷ. 수식의 연산시 발생하는 경우
		
명시적 형변환 : 형 변환 중 하나
	- 변수의 타입을 강제적으로 개발자가 변환하는 방법
	
	방법: (변환하고자하는 타입) 변수명(or 상수명)
*/