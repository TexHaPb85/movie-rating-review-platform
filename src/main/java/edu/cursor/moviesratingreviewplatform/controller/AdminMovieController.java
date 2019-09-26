package edu.cursor.moviesratingreviewplatform.controller;

import edu.cursor.moviesratingreviewplatform.entities.Movie;
import edu.cursor.moviesratingreviewplatform.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/movie")
public class AdminMovieController {
    private final MovieService movieService;

    @Autowired
    public AdminMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity addMovie(@RequestBody Movie movie) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.addMovie(movie));
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteTourById(@PathVariable("id") Long id) {
        movieService.removeMovieById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Movie with id:" + id + " removed");
    }

    @PutMapping("{id}")
    @ResponseBody
    public ResponseEntity editMovieById(@PathVariable("id") Long id, @RequestBody Movie movie) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.editMovieById(id, movie));
    }
}
