package com.javaex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Guestbook4Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Guestbook4Application.class, args);
	}

	@Override // 이 메서드를 추가
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Guestbook4Application.class);
	}

}
