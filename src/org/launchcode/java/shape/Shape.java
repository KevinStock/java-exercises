package org.launchcode.java.shape;

/**
 * Created by kevinstock on 3/20/17.
 */
public abstract class Shape {
    private final int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public abstract double getArea();
}
