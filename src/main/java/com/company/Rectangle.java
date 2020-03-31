package main.java.com.company;

import static java.lang.StrictMath.sqrt;

public class Rectangle {

    double height;
    double width;

    public Rectangle() {

        height = 1.2;
        width = 3.4;
    }

    public void getInfo() {

        System.out.println("--------Rectangle info---------");
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println();
    }

    public double getPerimetr() {

        return 2 * (width + height);
    }

    public double getSquare() {

        return width * height;
    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {

        return width;
    }

    public double getDiagonale() {

        return sqrt( height * height + width * width);
    }
 }
