package edu.cursor.moviesratingreviewplatform.controller;

import edu.cursor.moviesratingreviewplatform.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class UserMovieController {
    private final MovieService movieService;

    @Autowired
    public UserMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity getAllMovies() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.getAllMovies());
    }

    @GetMapping("{id}")
    public ResponseEntity getMovie(@PathVariable("id")Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.getMovieById(id));
    }

    @GetMapping("/sorted")
    public ResponseEntity getSortedMovies() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.getSortedMoviesByRate());
    }

    @GetMapping("{category}")
    public ResponseEntity getMoviesByCategory(@RequestParam("category")String category){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.getMoviesByCategory(category));
    }

    @PatchMapping("{movieId}")
    public ResponseEntity addRateToMovieById(@PathVariable("movieId")Long movieId, @RequestParam double rate){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.addRateToMovie(movieId,rate));
    }
}
