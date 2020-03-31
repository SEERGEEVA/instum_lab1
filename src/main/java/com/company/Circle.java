package main.java.com.company;

public class Circle {

    double radius;

    public Circle() {

        radius = 4;
    }

    public double getPerimetr() {

        return 2 * 3.14 * radius;
    }

    public double getSquare() {

        return 3.14 * radius * radius;
    }

    public void getInfo() {

        System.out.println("--------Circle info---------");
        System.out.println("radius: " + radius);
    }

    public double getRadius() {

        return radius;
    }

    public double getDiametr() {

        return 2 * radius;
    }

    public double gethalfPerimetr() {

        return 3.14 * radius;
    }
}
