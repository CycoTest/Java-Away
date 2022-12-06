public class AdvForEx01 {
	public static void main(String[] args) {
		int[] scores = {9, 7, 8, 9, 8};
		// 변수값 9, 7, 8, 9, 8 배열이 int 타입으로 변형되어 변수 scores에 저장됨
		
		int sum = 0;
		for(int s : scores) {
			sum += s; // sum = sum + s;
		}
		// for(int s=0; s < 5; s++) {
		// }	sum += scores[s];
		
		System.out.println("sum = " + sum);
	}

}
/*
향상된 for문

for([타입변수] : [배열]) {
}

*/