package selenium.sendemail;


import com.sun.org.apache.xpath.internal.operations.Mult;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) throws MessagingException {

        Properties props;
        Session session;
        MimeMessage message;

        InternetAddress[] recepient = new InternetAddress[1];
        recepient[0] =  new InternetAddress("karayla.devendra@gmail.com");
        String host = "smtp.gmail.com";

        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        String username = "karayla.devendra@gmail.com";
        String password = "jvpz tpli qnwo bcbo";

        Authenticator authenticator = new MyClass();

        session = Session.getDefaultInstance(props, authenticator);

        message = new MimeMessage(session);

        message.setFrom(new InternetAddress("karayla.devendra@gmail.com"));
        message.setRecipients(MimeMessage.RecipientType.TO,  recepient);

        message.setSubject("hello");

        message.setContent(
                "<h1>This is actual message embedded in HTML tags</h1>",
                "text/html");

        Transport.send(message);



    }



}


class MyClass extends Authenticator{

    String username = "karayla.devendra@gmail.com";
    String password = "jvpz tpli qnwo bcbo";

    @Override
    public PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication(username, password);

    }

}