package com.neal.divinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.neal.divinspringboot.web.servlet")
public class DivInSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DivInSpringBootApplication.class, args);
	}

}
