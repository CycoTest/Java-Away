package ex01_Interface.Polymorphism.Parser;

public class ParserManager {
//	리턴타입이 Parseable 인터페이스다
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}
