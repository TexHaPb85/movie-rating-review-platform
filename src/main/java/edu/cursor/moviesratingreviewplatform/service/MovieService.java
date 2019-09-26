package edu.cursor.moviesratingreviewplatform.service;

import edu.cursor.moviesratingreviewplatform.entities.Category;
import edu.cursor.moviesratingreviewplatform.entities.Movie;
import edu.cursor.moviesratingreviewplatform.exceptions.MovieNotFoundException;
import edu.cursor.moviesratingreviewplatform.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void removeMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    public Movie editMovieById(Long id, Movie movie) {
        movie.setId(id);
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository
                .findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    public String addRateToMovie(Long movieId, double rate) {
        return "New rate for movie with id:"
                + movieId + " is: "
                + movieRepository.findById(movieId).get().getRate().addVote(rate);
    }

    public List<Movie> getMoviesByCategory(String category){
        return movieRepository.findMovieByCategory(Category.valueOf(category));
    }

    public List<Movie> getSortedMoviesByRate(){
        List<Movie> sortedMovies =movieRepository.findAll();
        Collections.sort(sortedMovies);
        return sortedMovies;
    }
}
