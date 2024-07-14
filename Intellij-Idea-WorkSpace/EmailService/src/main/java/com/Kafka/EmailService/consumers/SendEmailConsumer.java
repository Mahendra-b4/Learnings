package com.Kafka.EmailService.consumers;

import com.Kafka.EmailService.dtos.SendEmailMessageDto;
import com.Kafka.EmailService.services.EmailUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.mail.Session;
import javax.mail.*;
import java.net.PasswordAuthentication;
import java.util.Properties;

@Service
public class SendEmailConsumer {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private EmailUtil emailUtil;

    @KafkaListener(
            id = "emailServiceConsumerGroup",
            topics = {"sendEmail"}
    )
    public void handleSendEmail(String message) throws Exception{
//        System.out.println("Got send email message");
        SendEmailMessageDto messageDto = objectMapper.readValue(message, SendEmailMessageDto.class);
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            // gotgmotmggit
            //override the getPasswordAuthentication method
//            public javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("mb@gmail.com", "ji".toCharArray());
//            }
        };
        Session session = Session.getInstance(props, auth);

        emailUtil.sendEmail(session, messageDto.getTo(),messageDto.getSubject(),messageDto.getBody());

    }
}
