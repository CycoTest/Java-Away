public class OperatorEx01_Basic_Operations1 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int a = 5, b = 6, c = 7;
		int res1 = 0, res2 = 0;
		
		a = b = c = 8;
		res1 = 100 * 2 + 7 % 5;
// 7 % 5 : 7를 5로 나누고 나온 나머지값을 뜻함
		res2 = 100 * (2 + 7) % 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(res1);
		System.out.println(res2);
	}

}
/*
+ Ch3. 연산자

연산(operations): 프로그램에서 데이터를 처리하여 결과를 산출하는 것

연산자(operator): 연산에 사용되는 표시나 기호
피연산자(operand): 연산되는 데이터
	ex) 3 + 4 : 연산자는 "+", 피연산자는 "3, 4"
	
연산식(expressions): 연산자와 피연산자를 이용하여 연산의 과정을 기술하는 것

+ 연산자와 연산식

- 비교 연산자


*/