package edu.cursor.moviesratingreviewplatform.entities;

import lombok.Data;

@Data
public class Movie {
    private Long id;
    private String name;
    private Category category;
    private String director;
    private String description;
    private double rate;
}
