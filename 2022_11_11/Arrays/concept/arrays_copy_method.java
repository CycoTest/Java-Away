package concept;
public class arrays_copy_method {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(abc);
		System.out.println(num);

		char[] result = new char[abc.length + num.length];

		System.arraycopy(abc, 0, result, 0, abc.length);
//		배열 abc의 객체 0번째부터의 값들을, '배열 result의 객체 0번째부터'에, 
//		배열 abc의 길이 만큼의 객체 자리까지 갖다 붙인다
		System.arraycopy(num, 0, result, abc.length, num.length);
//		배열 num의 객체 0번째부터의 값들을, '배열 result의 객체 0번째부터'에, 
//		배열 abc의 길이값인 번째 자릿수부터 배열 num의 길이값인 자리까지 갖다 붙인다
		System.out.println(result);

		System.arraycopy(abc, 0, num, 0, abc.length);
//		배열 abc의 객체 0번째부터의 값들을, '배열 num의 객체 0번째부터'에,
//		배열 abc의 길이 만큼의 객체 자리까지 갖다 붙인다
		System.out.println(num);

		System.arraycopy(abc, 0, num, 6, 3);
//		배열 abc의 객체 0번째부터의 값들을, '배열 num의 객체 6번째부터'에,
//		배열 abc의 객체 0번째자리의 값부터 3개의 값들을 순차적으로 갖다 붙인다
		System.out.println(num);
	}
}
/*
 *  배열 복사 명령어 : System.arraycopy()
 * 	- 지정된 범위의 값들을 한 번에 통째로 복사함
 * 	- 각 요소들이 연속적으로 저장되어 있다는 배열의 특성 때문에 이렇게 처리하는 것이 가능
 * 
 * 	- 괄호() 안에 들어가야 할 조건문들
 * 		-> 순서대로 Object src, int srcPos, Object dest, int destPos, int length
 * 
 * 
 * 
 */
