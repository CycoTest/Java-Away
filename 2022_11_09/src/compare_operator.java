public class compare_operator {
	public static void main(String[] args) {
		System.out.printf("10==10.0f \t\t %b=\n", 10 == 10.0f);
		System.out.printf("'0'==0 \t\t\t %b=\n", '0' == 0);
		System.out.printf("'A'==65 \t\t %b=\n", 'A' == 65);
		System.out.printf("'A'>'B' \t\t %b=\n", 'A' > 'B');
		System.out.printf("'A'+1 !='B' \t\t %b=\n", 'A' + 1 != 'B');
		
		System.out.println("======================================");
		
		float f = 0.1f;
		double d1 = 0.1;
		double d2 = (double) f;

		System.out.printf("10.0==10.0f %b\n", 10.0 == 10.0f);
		System.out.printf("0.1==0.1f %b\n", 0.1 == 0.1f);

		System.out.printf("f=%19.17f\n", f);
		System.out.printf("d1=%19.17f\n", d1);
		System.out.printf("d2=%19.17f\n", d2);
//		%19.17f의 의미: 소수점 17번째자리까지, 총 자릿수는 19자리. 점(.)도 자릿수에 들어감
//		X.xxxxxxxx...
//		따라서, %19.17f에서의 정수부는 1자리 밖에 되지 않음

		System.out.printf("d1==f %b\n", d1 == f);
		System.out.printf("d1==d2 %b\n", d1 == d2);
		System.out.printf("d2==f %b\n", d2 == f);
		System.out.printf("(float)d1==f %b\n", (float) d1 == f);
	}
}
/*
 * 대소비교 연산자(<, >, <=, >=)
 * 	- > : 좌변 값이 크면 true, 아니면 false
 * 	- < : 좌변 값이 작으면 true, 아니면 false
 * 	- <= : 좌변 값이 크거나 같으면 true, 아니면 false
 * 	- >= : 좌변 값이 작거나 같으면 true, 아니면 false
 * 
 * 등가비교 연산자(==, !=)
 * 	- == : 좌우변 값이 같으면 true, 아니면 false
 * 	- != : 좌우변 값이 다르면 true, 아니면 false
 */
