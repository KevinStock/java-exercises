package org.launchcode.java.shape;

/**
 * Created by kevinstock on 3/20/17.
 */
public class Square extends Shape {
    private double length;

    public Square(double length) {
        super(4);
        this.length = length;
    }

    public double getArea() {
        return this.length * this.length;
    }
}
