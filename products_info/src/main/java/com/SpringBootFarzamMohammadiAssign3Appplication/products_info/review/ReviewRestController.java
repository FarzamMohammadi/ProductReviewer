package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.review;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/reviews")
public class ReviewRestController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewRestController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/listReviews/{id}")
    public List<Review> getReviews(@PathVariable("id") Long productId) {
        List<List<Review>> reviewsToShow = reviewService.findByProductId(productId);
        List<Review> productReviews = null;
        if(reviewsToShow.size() == 1){
            productReviews = reviewsToShow.get(0);
        }

        return productReviews;
    }


    @PostMapping("/addReview")
    public String addNewProduct(@RequestBody Review review){
        reviewService.addNewReview(review);
        return "Review Added";
    }

    @DeleteMapping("/deleteReview/{id}")
    public String deleteProduct(@PathVariable("id") Long productId){
        reviewService.deleteReview(productId);
        return "Review Deleted";
    }

    @PutMapping("/updateReview")
    public String updateProduct(@RequestBody Review reviewToUpdate){
        reviewService.updateReview(reviewToUpdate);
        return "Review Updated";
    }
}
