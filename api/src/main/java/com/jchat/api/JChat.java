package com.jchat.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JChat {

	public static void main(String[] args) {
		SpringApplication.run(JChat.class, args);
	}

}
