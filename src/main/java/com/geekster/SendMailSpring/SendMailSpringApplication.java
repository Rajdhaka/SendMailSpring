package com.geekster.SendMailSpring;
import com.geekster.SendMailSpring.JavaMail.HandleMail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendMailSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendMailSpringApplication.class, args);
		HandleMail mailer= new HandleMail();
		mailer.sendMail();
	}

}

