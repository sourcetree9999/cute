package com.example.cute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class CuteApplication {

	public static void main(String[] args) {

		SpringApplication application=new SpringApplication(CuteApplication.class);
		application.setAddCommandLineProperties(false);
		application.setApplicationStartup(new BufferingApplicationStartup(2048));
		application.run( args);

	}

}
