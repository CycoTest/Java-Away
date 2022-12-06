public class IntExample {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012;
		int var3 = 0xA;
/* 
 012 = 1 x 8 + 2 x 8^0 = 10
 -> 0으로 시작하면, 컴퓨터는 8진수로 인식
 0xA = A(10) x 16^0 = 10
 -> 0x 또는 0X로 시작하면, 컴퓨터는 16진수로 인식
 	따라서, 0xA 는 16 진수의 1의 자리에만 수가 할당된 거다
*/
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}
// 변수 3개의 값을 10진수로 환산하면 모두 동일하게 10으로 나온다