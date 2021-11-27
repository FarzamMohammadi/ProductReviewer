package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    // USING QUERY:
    // @Query("SELECT p FROM Product p where p.name = ?1")
    // USING OPTIONAL:
    Optional<List<Review>> findByProductId(Long productId);
}
