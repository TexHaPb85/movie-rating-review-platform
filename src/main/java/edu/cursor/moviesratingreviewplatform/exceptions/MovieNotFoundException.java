package edu.cursor.moviesratingreviewplatform.exceptions;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long id) {
        super("Movie with id:" + id + " not found");
    }
}
