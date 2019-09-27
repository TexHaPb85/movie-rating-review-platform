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

    @Override
    public int compareTo(Movie o) {
        return (int) (this.rate.getRateValue()-o.rate.getRateValue());
    }
}
