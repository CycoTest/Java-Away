package Concept;

public class Getter_Setter {
	private int speed;

	void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	double getSpeed() {
		double km = speed * 1.6;
		return km;
	}
}
/*
 * Getter & Setter method
 * 	- 객체 지향 프로그래밍에서 객체의 데이터(필드)는 
 * 		객체 외부에서 직접적으로 접근하는 것을 막는다
 * 		
 * 		필드들을 private 접근 제한자로 막아두고,
 * 		각 필드의 Getter, Setter로 접근하는 방식을 사용한다
 * 
 * 		그 이유는 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우
 * 		"객체의 무결성(결점이 없는 성질)"이 깨어질 수 있기 때문이다
 * 
 *  - 이러한 문제점을 해결하기 위해서 객체 지향 프로그래밍에서는
 *  	필드를 private로 만들어 외부의 접근을 제한한 후,
 *  
 *  	Setter를 사용해 전달받은 값을 내부에서 가공해 필드에 넣어주는 방식을 사용
 *  	
 *  	필드 값을 가져올 때도,
 *  	Getter를 사용해 본 필드의 값을 숨긴 채, 내부에서 가공된 값을 꺼낼 수 있다
 * 
 * 	ex) ex02_Getter_Setter
 * 
 *  + Eclipse의 Getter/Setter method 자동 생성 기능
 *  	- 필드를 선언한 후,
 *  	- Source -> Generate Getter and Setters
 *  
 *  
 */
