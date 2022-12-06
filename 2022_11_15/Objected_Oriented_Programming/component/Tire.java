package component;

public class Tire {
		private int size;
		
		public Tire() {
			System.out.println("Tire Constructor");
			size =0;
		}
		
		public int getSize() {
			return size;
		}
		
		public void setSize(int size) {
			this.size = size;
		}
}
/*
 * 위 코드에서,
 * 
 * 멤버 변수 = 1개
 * 	-> size
 * 메소드 = 3개
 * 	-> Tire(), getSize(), setSize()
 * 생성자 = 1개
 * 	-> Tire()
 */
