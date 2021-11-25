package com.SpringBootFarzamMohammadiAssign3Appplication.products_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductsInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsInfoApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
