package com.geekster.SendMailSpring.JavaMail;

import com.geekster.SendMailSpring.GetApiData;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import static com.geekster.SendMailSpring.JavaMail.MailConstants.RECEIVERMAILADDRESS;

public class HandleMail {

     public void sendMail(){
        //get the system properties
        Properties props= System.getProperties();
        String host="smtp.gmail.com";

        //set properties
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.ssl.enable","true");
        props.put("mail.smtp.auth","true");

        // to get the session object
        Session mailSession= Session.getInstance(props, new MailAuthenticator());

        // create the message object
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        try {
            // from email/sender
            mimeMessage.setFrom(MailConstants.SENDER);

            //adding recipient to message
            mimeMessage.setRecipients(MimeMessage.RecipientType.TO, String.valueOf(new InternetAddress(RECEIVERMAILADDRESS)));

            // adding subject to message
            mimeMessage.setSubject(MailConstants.SUBJECT);

            //adding text to message
            GetApiData obj= new GetApiData();
            mimeMessage.setText(obj.getData());

            // send the message
            Transport.send(mimeMessage);

            System.out.println("Sent successfully !!!");
        }
        catch (MessagingException e) {
           e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
     }
}
