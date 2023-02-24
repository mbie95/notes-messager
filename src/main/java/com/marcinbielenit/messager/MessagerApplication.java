package com.marcinbielenit.messager;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MessagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagerApplication.class, args);
	}
        
        @Bean
        public MessageConverter messageConverter() {
            return new Jackson2JsonMessageConverter();
        }

}
