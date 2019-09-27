package edu.cursor.moviesratingreviewplatform;

import edu.cursor.moviesratingreviewplatform.entities.Category;
import edu.cursor.moviesratingreviewplatform.entities.Rate;
import org.junit.Test;

public class LocalTests {
    @Test
    public void rateTest(){
        Rate rate = new Rate(9.9,15);
        rate.addVote(2.2);
        System.out.println(rate.getRateValue());
    }

    @Test
    public void enumTest(){
        System.out.println(Category.valueOf("SCI_FI"));
    }
}
