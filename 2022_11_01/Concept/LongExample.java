public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 200L;
/*		long var3 = 10000000000000;
		자바에서 정수는 무조건 int 타입으로 인식한다
*/
		long var4 = 10000000000000L;
// 뒤에 L을 붙인 이유 : 해당 변수값이 long 타입으로 변환해주기 위함
// 뒤에 D를 붙이는 경우 = 타입을 double로 변환해줌		

		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}

}
