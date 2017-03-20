package org.launchcode.java.shape;

/**
 * Created by kevinstock on 3/20/17.
 */
public class Shapes {
    public static void main(String[] args) {
        Shape sq1 = new Square(3.4);
        Shape rect1 = new Rectangle(2.3, 9.8);
        Shape cir1 = new Circle(3.5, 2.7);

        System.out.println("Square Area: " + sq1.getArea());
        System.out.println("Rectangle Area: " + rect1.getArea());
        System.out.println("Circle Area: " + cir1.getArea());
    }
}
