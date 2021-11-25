package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.product;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return List.of(
                new Product(
                        1L,
                        "MSI LAPTOP",
                        1299.99,
                        5
                )
        );
    }
}
