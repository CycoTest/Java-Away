package ex01_Interface.Polymorphism.Parser;

public class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
//		구문 분석작업을 수행하는 코드 작성
		System.out.println(fileName + "- XML parsing completed.");
	}
}
