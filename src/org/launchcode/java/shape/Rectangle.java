package org.launchcode.java.shape;

/**
 * Created by kevinstock on 3/20/17.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }
}
