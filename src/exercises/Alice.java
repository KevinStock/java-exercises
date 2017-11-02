package exercises;

import java.util.Scanner;

/**
 * Created by kevinstock on 11/2/17.
 * Write a program to calculate the area of a rectangle and print the answer to the console.
 * You should prompt the user for the dimensions. (What data types should the dimensions be?)
 */
public class Alice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter length: ");
        double length = reader.nextDouble();
        System.out.println("Enter width: ");
        double width = reader.nextDouble();
        reader.close();
        double area = length * width;
        System.out.println("Area: " + area);
    }
}