package SadanFactory;

public class Sedan {
	public static void main(String[] args) {
		Component.Tire compoTire = new Component.Tire();
/*
 *  만약 Component.Tire가 아닌 Tire로만 할 경우,
 *  public class 위에 
 *  'import Component.Tire'라는 명령어가 추가됨
 */
		compoTire.size = 20;
		
		System.out.println(compoTire.size);
	}
}
/*
 * 
 * 
 */
