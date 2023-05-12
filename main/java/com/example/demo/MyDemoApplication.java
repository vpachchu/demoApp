package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyDemoApplication.class, args);
		Home home = context.getBean(Home.class);
		Home home2 = context.getBean(Home.class);
		home.connect();
		home2.connect();
	}

}
