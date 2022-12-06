package concept;
import java.util.Arrays;

public class arrays_string01 {
	public static void main(String[] args) {
		int iArr[] = { 100, 95, 80, 70, 60 };
		System.out.println(Arrays.toString(iArr));
		
		System.out.println(iArr);
//		출력값이 '타입@주소'의 형식으로 나옴
//		'[I' = 1차원의 int 베열 이라는 의미
//		'@' 뒤에 나오는 16진수는 배열의 주소인데, 실제 주소가 아닌 내부 주소를 나타냄
	}
}
