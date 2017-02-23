package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by kevinstock on 2/22/17.
 */
public class Area {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        while (radius <= 0) {
            System.out.println("Please provide a positive integer greater than 0");
            System.out.print("Enter a radius: ");
            radius = in.nextInt();
        }
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
