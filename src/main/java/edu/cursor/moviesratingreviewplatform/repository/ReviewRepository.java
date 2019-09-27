package edu.cursor.moviesratingreviewplatform.repository;

import edu.cursor.moviesratingreviewplatform.entities.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review,String>{
}
