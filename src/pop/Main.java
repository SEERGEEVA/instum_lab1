package pop;


import main.java.com.company.Circle;
import main.java.com.company.Rectangle;
import main.java.com.company.Square;

public class Main {

    /**
     * This is a main class
     * <p>
     * Solving problems
     * <ul>
     *     <li> Hi, vsem peace </li>
     * </ul>
     */

    public static void main(String[] args) {
        System.out.println("Chikibambony");

        Circle circle = new Circle();
        circle.getInfo();
        System.out.println("perimetr: " + circle.getPerimetr());
        System.out.println("square: " + circle.getSquare());

        /**
         * This is info about rectangle
         */
        Rectangle rectangle = new Rectangle();
        rectangle.getInfo();

        Square square = new Square();
        square.getInfo();

        

    }                                                    
}



