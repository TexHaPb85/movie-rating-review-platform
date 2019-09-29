package edu.cursor.moviesratingreviewplatform.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Comparable<Movie>{
    private String id;
    private String name;
    private Category category;
    private String director;
    private String description;
    private Rate rate;

    public Movie(String name, Category category, String director, String description, Rate rate) {
        this.name = name;
        this.category = category;
        this.director = director;
        this.description = description;
        this.rate = rate;
    }

    @Override
    public int compareTo(Movie o) {
        return (int) (this.rate.getRateValue()-o.rate.getRateValue());
    }
}
