package edu.cursor.moviesratingreviewplatform.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private String id;
    private String movieId;
    private String reviewText;
    private Boolean isLiked;
}
