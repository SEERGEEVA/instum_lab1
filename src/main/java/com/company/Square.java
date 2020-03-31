package main.java.com.company;

public class Square {

    double side;

    public Square() {

        side = 6.5;
    }

    public void getInfo() {

        System.out.println("--------Square info-------");
        System.out.println("side: " + side);
        System.out.println();
    }

    public double getPerimetr() {

        return 4 * side;
    }

    public double getSquare() {

        return side * side;
    }

    public double getSide() {

        return side;
    }
}
