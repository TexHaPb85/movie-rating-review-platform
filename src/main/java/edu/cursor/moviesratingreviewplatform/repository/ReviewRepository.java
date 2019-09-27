package edu.cursor.moviesratingreviewplatform.repository;

import edu.cursor.moviesratingreviewplatform.entities.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review,String>{
    List<Review> getReviewsByMovieId(String movieId);
}
