package concept_examples;
class Person { 
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
//	public void setSsn(String ssn) {
//		this.ssn = ssn;
//	}
//	The final field Person.ssn cannot be assigned
}
// public class Person으로 선언할 경우, 
// 새 class 파일을 생성하고 거기에 Person class를 입력해야 함

public class Final_Constant {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "KyeBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA";
//		The final field Person.nation cannot be assigned.
		
//		p1.ssn = "654321-7654321";
//		The final field Person.ssn cannot be assigned.
		
		p1.name = "LeeSoonSin";
	}

}
