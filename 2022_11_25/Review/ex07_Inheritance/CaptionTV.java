package ex07_Inheritance;

public class CaptionTV extends TV {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
