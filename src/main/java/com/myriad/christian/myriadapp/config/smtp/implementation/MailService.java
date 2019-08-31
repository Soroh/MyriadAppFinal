package com.myriad.christian.myriadapp.config.smtp.implementation;

import com.myriad.christian.myriadapp.config.smtp.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

@Service
public class MailService implements IMailService {

    private JavaMailSender mailSender;
    private Environment environment;

    @Autowired
    public MailService(JavaMailSender mailSender, Environment environment) {
        this.mailSender = mailSender;
        this.environment = environment;
    }

    @Override
    public void sendMail(String to, String from, String subject, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setFrom(from);
        mailMessage.setSubject(subject);
        mailMessage.setText("Testing amount");
        mailMessage.setSentDate(new Date());
        mailMessage.setReplyTo(to);
        mailSender.send(mailMessage);
    }

    @Override
    public void sendMailUsingTemplate(String to, String from, String subject, String message)
            throws MessagingException, UnsupportedEncodingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", environment.getProperty("spring.mail.host"));
        properties.put("mail.smtp.port", environment.getProperty("spring.mail.port"));
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", environment.getProperty("spring.mail.username"));
        properties.put("mail.password", environment.getProperty("spring.mail.password"));

        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(environment.getProperty("spring.mail.username"),
                        environment.getProperty("spring.mail.password"));
            }
        };
        Session session = Session.getInstance(properties, auth);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(from, "Myriads For Jesus"));
        if (to != null && !to.isEmpty()) {
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(message, "text/html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            msg.setContent(multipart);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("Please confirm you email.");
            msg.setSentDate(new Date());
            msg.setReplyTo(InternetAddress.parse(from));
            Transport.send(msg);
        }
    }

}
