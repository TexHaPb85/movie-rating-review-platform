package edu.cursor.moviesratingreviewplatform.service;

import edu.cursor.moviesratingreviewplatform.entities.Review;
import edu.cursor.moviesratingreviewplatform.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review addReviewToMovie(String movieId, Review review){
        review.setMovieId(movieId);
        return reviewRepository.save(review);
    }

    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    public List<Review> getReviewsAboutMovieById(String movieId){
        return reviewRepository.getReviewsByMovieId(movieId);
    }
}
