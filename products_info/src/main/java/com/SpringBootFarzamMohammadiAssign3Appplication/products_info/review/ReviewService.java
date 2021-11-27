package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public String findByProductId(Review review) {
        Optional<List<Review>> reviewForProduct = reviewRepository.findByProductId(review.getProductId().longValue());

        if (reviewForProduct.isEmpty()){
            throw new IllegalStateException("There are no review for this product.");
        }
        else{
            return reviewForProduct.toString();
        }
    }

    public void addNewReview(Review review) {
        Optional<List<Review>> reviewForProduct = reviewRepository.findByProductId(review.getProductId().longValue());

        if (reviewForProduct.isEmpty()){
            throw new IllegalStateException("There are no review for this product.");
        }
        else{
             reviewRepository.save(review);
        }
    }
}
