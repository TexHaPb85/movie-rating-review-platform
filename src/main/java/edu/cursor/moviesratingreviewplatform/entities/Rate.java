package edu.cursor.moviesratingreviewplatform.entities;

import lombok.Data;

@Data
public class Rate {
    private double rateValue;
    private int countOfVotes;
}
