package edu.cursor.moviesratingreviewplatform.entities;

import lombok.Data;

@Data
public class Movie implements Comparable<Movie>{
    private Long id;
    private String name;
    private Category category;
    private String director;
    private String description;
    private Rate rate;

    @Override
    public int compareTo(Movie o) {
        return (int) (this.rate.getRateValue()-o.rate.getRateValue());
    }
}
