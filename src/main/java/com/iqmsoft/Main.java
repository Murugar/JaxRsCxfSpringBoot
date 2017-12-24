package com.iqmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iqmsoft.config.Config;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}
}
