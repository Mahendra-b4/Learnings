package com.Kafka.EmailService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailMessageDto {
    private String from;
    private String to;
    private String body;
    private String subject;
    private String password;
}