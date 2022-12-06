public class OperatorEx12_overflow {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		// x와 y의 변수값은 int 타입으로 되어있는 상황이기 때문에,
		// 산출값이 int 타입의 범위를 넘어버려 overflow(일명 깨짐 현상)이 발생하여 출력값이 깨짐
		long lz1 = (long)x * (long)y;
		// 타입 캐스팅으로 x와 y의 타입을 강제로 long으로 변경하고 연산이 들어갔다
		// 따라서, 연산 결과값은 연산 전 변수들의 타입이 long으로 변경되어있어 long 범위 내면 값의 손실이 일어나지 않음 
		long lz2 = (long)(x * y);
		// 연산 순서를 보면 괄호가 먼저기 때문에 x*y의 타입은 int 타입인 채로 진행하기 때문에
		// 연산 결과값도 int 타입으로 들어가고, 결과값은 int 타입의 범위를 초과하여 값의 손실이 발생하고
		// overflow가 발생
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}
}
