package com.SpringBootFarzamMohammadiAssign3Appplication.products_info;

import com.SpringBootFarzamMohammadiAssign3Appplication.products_info.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class ProductsInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsInfoApplication.class, args);

	}
}
