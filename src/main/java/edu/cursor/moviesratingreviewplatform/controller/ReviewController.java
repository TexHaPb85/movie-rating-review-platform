package edu.cursor.moviesratingreviewplatform.controller;

import edu.cursor.moviesratingreviewplatform.entities.Review;
import edu.cursor.moviesratingreviewplatform.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PutMapping("{movieId}")
    @ResponseBody
    public ResponseEntity addReviewToMovieById(@PathVariable("movieId") String movieId, @RequestBody Review review) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(reviewService.addReviewToMovie(movieId, review));
    }

    @GetMapping
    public ResponseEntity getAllReviews(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(reviewService.getAllReviews());
    }

    @GetMapping("{movieId}")
    public ResponseEntity getReviewsAboutMovieById(@PathVariable("movieId") String movieId){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(reviewService.getReviewsAboutMovieById(movieId));
    }
}
