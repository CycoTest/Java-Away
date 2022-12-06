package concept;
public class Final {

	public static void main(String[] args) {

	}
}
/*
 * 상속(Inheritance)
 * 
 * 부모 클래스 : (field + method)
 * 
 * 자식 클래스 : (field + method) + field + method 
 * 
 * 6) final
 * 	- class, field, method에 사용 가능
 * 		-> 해당 선언이 최종 상태이고 결코 수정될 수 없음
 * 
 * 	- final class는 상속 불가
 * 		ex) public final class 클래스명 {}
 * 		=> ex07
 * 
 * 	- final method는 overriding 할 수 없음
 * 		ex) public final 리턴 타입 메소드명() {}
 * 		=> ex08		
 * 
 * 	=> 특정 메소드만 오버라이딩을 방지하고 싶다면,
 * 		방지하고 싶은 메소드 앞에 final 키워드를 붙여줌으로써
 * 		상속받는 자식 클래스에서 수정할 수 없게 됨
 */
