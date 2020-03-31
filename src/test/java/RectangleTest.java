package test.java;

import main.java.com.company.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getHeight() {

        Rectangle rectangletest1 = new Rectangle();
        double actualtest1 = rectangletest1.getHeight();
        assertEquals(actualtest1 > 0, true);
    }

    @Test
    public void getWidth() {

        Rectangle rectangletest2 = new Rectangle();
        double actualtest2 = rectangletest2.getWidth();
        assertEquals(actualtest2 > 0, true);
    }

    @Test
    public void getPerimetr() {

        Rectangle rectangle1 = new Rectangle();
        double actual1 = rectangle1.getPerimetr();
        double expected1 = 9.2;
        assertEquals(expected1,actual1,0.0);
    }

    @Test
    public void getSquare() {

        Rectangle rectangle2 = new Rectangle();
        double actual2 = rectangle2.getSquare();
        double expected2 = 4.08;
        assertEquals(expected2,actual2 ,0.0);
    }
}