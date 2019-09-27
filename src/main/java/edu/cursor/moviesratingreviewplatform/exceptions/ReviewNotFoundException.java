package edu.cursor.moviesratingreviewplatform.exceptions;

public class ReviewNotFoundException extends RuntimeException {
    public ReviewNotFoundException(String id) {
        super("Review with id:" + id + "not found");
    }
}
