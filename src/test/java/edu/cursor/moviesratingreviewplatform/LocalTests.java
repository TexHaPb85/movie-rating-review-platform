package edu.cursor.moviesratingreviewplatform;

import edu.cursor.moviesratingreviewplatform.entities.Rate;
import org.junit.Test;

public class LocalTests {
    @Test
    public void test(){
        Rate rate = new Rate(9.9,15);
        rate.addVote(2.2);
        System.out.println(rate.getRateValue());
    }
}
