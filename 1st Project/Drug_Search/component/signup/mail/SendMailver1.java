package component.signup.mail;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailver1 {
	private String toMail;
	private String random;

	private String sendRandom() {
		StringBuffer temp =new StringBuffer();
		Random rnd = new Random();
		for(int i=0;i<10;i++)
		{
			int rIndex = rnd.nextInt(3);
			switch (rIndex) {
			case 0:
				// a-z
				temp.append((char) ((int) (rnd.nextInt(26)) + 97));
				break;
			case 1:
				// A-Z
				temp.append((char) ((int) (rnd.nextInt(26)) + 65));
				break;
			case 2:
				// 0-9
				temp.append((rnd.nextInt(10)));
				break;
			}
		}
		random = temp.toString();
		System.out.println(random);
		return random;
	}
	
	public void verifyMail(String toAddress) {
		String host = "smtp.naver.com";
		String user = "projecttestp@naver.com";
		String password = "9125Elwlahd!";
		String to = toAddress;
		
		System.out.println(to);
		
		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		
		// Compose the message
		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(user));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			// Subject
			msg.setSubject("[인증 코드] Java Mail Verification");
			
			// Text
			sendRandom();
			msg.setText("인증 코드: " + random);
			
			// send the message
			Transport.send(msg);
			toMail = to;
			System.out.println("message sent successfully...");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getToAddress() {
		return toMail;
	}
	
	public String getRandNum() {
		return random;
	}
}
