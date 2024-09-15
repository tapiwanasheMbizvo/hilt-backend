package com.tapiwanashembizvo.hilt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties
public class HiltApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiltApplication.class, args);
	}

}
