package com.SpringBootFarzamMohammadiAssign3Appplication.products_info.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
@Controller
@RequestMapping(path= "reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @GetMapping("/listReviews")
    public String getReviews(@ModelAttribute Review review,Model model) {
        model.addAttribute("reviews", reviewService.findByProductId(review));
        String reviewsToShow = reviewService.findByProductId(review);
        return "reviews/list";
    }

    @GetMapping("/addNewReview/{id}")
    public String addNewReviewFrom(@PathVariable("id") Long productId, Model model) {
        Review newReview = new Review();
        newReview.setProductId(productId);
        model.addAttribute("review", newReview);
        return "reviews/add";
    }
    @PostMapping("/addNewReview")
    public String addNewReviewSubmit(@ModelAttribute Review review, Model model) {
        addNewReview(review);
        return "products/list";
    }


    @PostMapping
    public void addNewReview(@RequestBody Review review){
        reviewService.addNewReview(review);
    }
}