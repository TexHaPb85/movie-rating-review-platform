package edu.cursor.moviesratingreviewplatform.repository;

import edu.cursor.moviesratingreviewplatform.entities.Category;
import edu.cursor.moviesratingreviewplatform.entities.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    List<Movie> findMovieByCategory(Category category);
}
