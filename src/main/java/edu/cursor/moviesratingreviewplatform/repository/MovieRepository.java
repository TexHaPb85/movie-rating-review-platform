package edu.cursor.moviesratingreviewplatform.repository;

import edu.cursor.moviesratingreviewplatform.entities.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, Long> {
}
