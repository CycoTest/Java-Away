package component.signup.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailver2 {
	private String toMail;
	private String randNum;

	private String sendRandomNum() {
		StringBuffer buffer = new StringBuffer();
		for (int i=0; i<6; i++) {
			int n = (int)(Math.random()*10);
			buffer.append(n);
		}
		randNum = buffer.toString();
		
		return randNum;
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
			sendRandomNum();
			msg.setText("인증 코드: " + randNum);
			
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
		return randNum;
	}
}
