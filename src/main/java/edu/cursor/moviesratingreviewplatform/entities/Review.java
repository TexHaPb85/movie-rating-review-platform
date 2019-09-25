package edu.cursor.moviesratingreviewplatform.entities;

import lombok.Data;

@Data
public class Review {
    private Long id;
    private Long movieId;
    private String reviewText;
    private Boolean isLiked;
}
