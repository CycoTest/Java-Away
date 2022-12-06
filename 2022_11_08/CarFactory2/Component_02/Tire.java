package Component_02;

public class Tire {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >= 0) {
			this.size = size;			
		}
	}
}
/*
 * private를 입력하고 get/set+변수명 명령어를 불러고 싶을 때,
 * 
 * 	- 상단 메뉴 중 Source 선택
 * 	- Generate Setters and Setters 선택
 * 	- 해당 변수명이 선택창에 뜨고, 그걸 선택
 * 	-> 그럼 알아서 get/set+변수명 설정을 자동완성해줌
 */
