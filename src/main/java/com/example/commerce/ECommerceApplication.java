package com.example.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ECommerceApplication {
	@RequestMapping(value="/")
public String index () {
	return "<h1> hello <h1>";
}
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

}
