package com.geekster.SendMailSpring.JavaMail;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {
    @Override
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(MailConstants.SENDER, "sxmnpjsbnfliqdpt");
    }

}
