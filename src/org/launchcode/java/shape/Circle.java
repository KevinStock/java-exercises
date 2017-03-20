package org.launchcode.java.shape;

/**
 * Created by kevinstock on 3/20/17.
 */
public class Circle extends Shape {
    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        super(1);
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
