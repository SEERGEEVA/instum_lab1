package test.java;

import com.sun.org.apache.xpath.internal.operations.Equals;
import main.java.com.company.Circle;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CircleTest {

    @org.junit.Test
    public void isValid() {

        Circle circletest = new Circle();
        double actualtest = circletest.getRadius();
        assertEquals(actualtest > 0, true);

    }

    @org.junit.Test
    public void getPerimetr() {

        Circle circles1 = new Circle();
        double actual1 = circles1.getPerimetr();
        double expected1 = 25.12;
        assertEquals(expected1,actual1,0.0);
    }

    @org.junit.Test
    public void getSquare() {

        Circle circles2 = new Circle();
        double actual2 = circles2.getSquare();
        double expected2 = 50.24;
        assertEquals(expected2,actual2 ,0.0);
    }


}