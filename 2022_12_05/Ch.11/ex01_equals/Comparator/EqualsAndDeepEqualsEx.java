package ex01_equals.Comparator;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
//		Integer랑 int와 혼동하지 말 것!
//		Wrapper 타입은 직접적으로 변수에 값을 저장하는 것이 가능

		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println();

		Integer arr1[] = { 1, 2 };
		Integer arr2[] = { 1, 2 };
//		

		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}
}
