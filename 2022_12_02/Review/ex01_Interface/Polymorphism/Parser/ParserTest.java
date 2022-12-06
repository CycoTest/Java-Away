package ex01_Interface.Polymorphism.Parser;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}

}
