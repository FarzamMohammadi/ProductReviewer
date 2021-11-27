package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // USING QUERY:
    // @Query("SELECT p FROM Product p where p.name = ?1")
    // USING OPTIONAL:
    Optional<Product> findProductByName(String name);


}
