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

    public void removeMovieById(String id) {
        movieRepository.deleteById(id);
    }

    public Movie editMovieById(String id, Movie movie) {
        movie.setId(id);
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(String id) {
        return movieRepository
                .findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    public Movie addRateToMovie(String movieId, double rate) {
        Movie movie = movieRepository
                .findById(movieId)
                .orElseThrow(() -> new MovieNotFoundException(movieId));

        movie.getRate()
                .addVote(rate);
        return movieRepository.save(movie);
    }

    public List<Movie> getMoviesByCategory(String category) {
        return movieRepository.findMovieByCategory(Category.valueOf(category));
    }

    public List<Movie> getSortedMoviesByRate() {
        List<Movie> sortedMovies = movieRepository.findAll();
        Collections.sort(sortedMovies);
        return sortedMovies;
    }
}
