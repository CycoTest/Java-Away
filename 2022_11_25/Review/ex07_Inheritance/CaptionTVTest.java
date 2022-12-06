package ex07_Inheritance;

public class CaptionTVTest {
	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();

		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);

		ctv.displayCaption("Hello, World1");
		ctv.caption = true;
		ctv.displayCaption("Hello, World2");
	}
}
