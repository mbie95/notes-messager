package com.marcinbielenit.messager;

import javax.mail.MessagingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 *
 * @author marcin
 */
@Service
@Slf4j
public class MessageListener {
    
    private final MailService mailService;

    public MessageListener(MailService mailService) {
        this.mailService = mailService;
    }
    
    @RabbitListener(queues = "messages")
    public void messageListener(Mail message) {
        try {
            mailService.sendMail(message);
        } catch (MessagingException e) {
            log.error("Email couldn't be send!");
        }
    }
}
