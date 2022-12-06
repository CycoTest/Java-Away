package ex01_Interface.Polymorphism.Parser;

public class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		
		System.out.println(fileName + "- HTML parsing completed.");
	}

}
