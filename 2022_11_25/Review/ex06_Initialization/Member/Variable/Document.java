package ex06_Initialization.Member.Variable;

public class Document {
	static int count = 0;
	String name;

	Document() {
		this("제목없음" + ++count);
	}

	Document(String name) {
		this.name = name;
		System.out.printf("문서 %s가 생성되었습니다.\n", this.name);
	}
}
