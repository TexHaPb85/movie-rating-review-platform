package edu.cursor.moviesratingreviewplatform.controller;

import edu.cursor.moviesratingreviewplatform.entities.Review;
import edu.cursor.moviesratingreviewplatform.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie/review")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PutMapping("{movieId}")
    @ResponseBody
    public ResponseEntity addReviewToMovieById(@PathVariable("movieId") Long movieId, @RequestBody Review review) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(reviewService.addReviewToMovie(movieId, review));
    }
}
