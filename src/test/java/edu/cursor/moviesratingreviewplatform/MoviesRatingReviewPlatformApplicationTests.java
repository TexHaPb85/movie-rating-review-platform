package edu.cursor.moviesratingreviewplatform;

import edu.cursor.moviesratingreviewplatform.entities.Category;
import edu.cursor.moviesratingreviewplatform.entities.Movie;
import edu.cursor.moviesratingreviewplatform.entities.Rate;
import edu.cursor.moviesratingreviewplatform.repository.MovieRepository;
import edu.cursor.moviesratingreviewplatform.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesRatingReviewPlatformApplicationTests {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void addMovie() {
        MovieService movieService = new MovieService(movieRepository);
        Rate rate = new Rate(9.1,42);
        Movie movie = new Movie(1L,"Avengers", Category.ACT,"Rufalo","superheros film",rate);
        movieService.addMovie(movie);
    }

}
