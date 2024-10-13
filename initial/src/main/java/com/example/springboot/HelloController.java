package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot! verifiy test";
	}
	    // Add this method to map to the "/hello" endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

}
