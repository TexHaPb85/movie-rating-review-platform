package edu.cursor.moviesratingreviewplatform;

import edu.cursor.moviesratingreviewplatform.entities.Category;
import edu.cursor.moviesratingreviewplatform.entities.Movie;
import edu.cursor.moviesratingreviewplatform.entities.Rate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesRatingReviewPlatformApplicationTests {

    private RestTemplate restTemplate = new RestTemplate();


    /**
     * ResourceAccessException: I/O error on POST request for "http://localhost:8081/admin/movie":
     * Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
     */
    @Test
    public void addMovie() {
        String resourceUrl = "http://localhost:8081/admin/movie";

        Rate rate = new Rate(10.0, 1112);
        Movie requestMovie = new Movie("Iron Man", Category.ACT, "Russo junior", "Tony Stark beginning", rate);

        HttpEntity<Movie> request = new HttpEntity<>(requestMovie);
        Movie responseMovie = restTemplate.postForObject(resourceUrl, request, Movie.class);
        System.out.println(responseMovie);
    }

}
