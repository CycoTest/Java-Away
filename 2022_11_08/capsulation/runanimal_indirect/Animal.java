package runanimal_indirect;

class Animal {
	private String name;
	int age;
// private : 외부(다른 클래스)에서 해당 클래스의 객체를 열람하지 못하게 막음
	
	public void setName(String pname ) {
		name = pname;
	}
//  	
	public String getName() {
		return name;
	}
//
	
}
/*
 * 정보 은닉(Information Hiding)을 하는 이유
 * 
 * 	- 무분별한 수정을 못하게 하고, 개개인이 설정해놓은 권리를 보장하기 위함
 */
