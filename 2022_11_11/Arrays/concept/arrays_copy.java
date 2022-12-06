package concept;
public class arrays_copy {
	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println("[변경 전]");
		System.out.println("arr.length: " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

		int[] tmp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
//		배열 변수 tmp한테 지정된 주소값을 배열 변수 arr에 넣는다는 의미
//		즉, 기존의 arr 배열 객체는 JVM에 의해 삭제 처리된다
		
		System.out.println("[변경 후]");
		System.out.println("tmp.length: " + tmp.length);

		for (int i = 0; i < tmp.length; i++) {
			System.out.println("tmp[" + i + "]: " + tmp[i]);
		}
	}
}
/*
 * 배열의 길이 변경법 (=복사법)
 * 	1) 더 큰 배열을 새로 생성
 * 	2) 기존 배열의 내용을 새로운 배열에 복사
 * 		-> 하지만 아예 처음부터 여윳공간을 생각하고 크게 만드는 게 더 낫다!
 * 		-> 왜냐면 복사%붙여넣기 과정 중 불필요한 메모리가 소모되기 때문에 장기적으로 볼 때, 낭비가 심하다
 */
