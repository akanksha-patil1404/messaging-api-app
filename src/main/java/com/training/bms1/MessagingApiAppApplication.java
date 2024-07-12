package com.training.bms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MessagingApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		System.out.println(printGreetings());
	}
	
	
	@GetMapping("hi")
	public static String printGreetings(){
		return "Hi Oracle";
	}

}
