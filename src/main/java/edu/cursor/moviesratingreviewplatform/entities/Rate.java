package edu.cursor.moviesratingreviewplatform.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rate {
    private double rateValue;
    private int countOfVotes;

    public double addVote(double vote){
        double newRateValue = rateValue*countOfVotes;
        newRateValue+=vote;
        countOfVotes++;
        rateValue=newRateValue/countOfVotes;
        return rateValue;
    }
}
