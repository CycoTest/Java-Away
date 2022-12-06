package quiz01;

import java.util.Scanner;

public class Main_Tutor02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[6];
		boolean[] chk = new boolean[6];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < ar.length; j++) {
				if (max < ar[j] && chk[j]==false) {
					max = ar[j];
				}
			}

			for (int j = 0; j < ar.length; j++) {
				if (max == ar[j]) {
					chk[j] = true;
//					구해낸 최대값을 강제로 -1로 바꿈, 다음 최대값을 찾기 위해 제1조건으로 리턴하게 해줌
//					만약 입력되는 값이 음수로 나올 경우, 최대값을 상수값 Integer.MIN_VALUE 
//					혹은 선언된 변수 타입으론 인식이 안 되는 것으로 치환하여 입력되는 방식을 선택하면 됨
					
//					단, 다른 타입의 배열 변수를 추가할 경우 다른 조건들 역시 조금씩은 고쳐줘야 함
				}
			}

			for (int j = 0; j < ar.length; j++) {
				System.out.printf("%5d ", ar[j]);
			}
			System.out.println();
			
			for (int j = 0; j < ar.length; j++) {
				System.out.printf("%5b ", chk[j]);
//	            System.out.print(chk[j] + " ");
			}
			System.out.print(" : MAX = " + max + "\n");
		}
	}
}
// input ex) -27 5 -19 90 72 -39