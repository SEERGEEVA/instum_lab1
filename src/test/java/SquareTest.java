package test.java;

import main.java.com.company.Square;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void getSide() {

        Square squaretest = new Square();
        double actualtest = squaretest.getSide();
        assertEquals(actualtest > 0, true);
    }

    @Test
    public void getPerimetr() {

        Square square1 = new Square();
        double actual1 = square1.getPerimetr();
        double expected1 = 26;
        assertEquals(expected1,actual1,0.0);

    }

    @Test
    public void getSquare() {

        Square square2 = new Square();
        double actual2 = square2.getSquare();
        double expected2 = 42.25;
        assertEquals(expected2,actual2,0.0);
    }
}