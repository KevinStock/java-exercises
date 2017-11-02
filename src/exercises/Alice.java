package exercises;

import java.util.Scanner;

/**
 * Created by kevinstock on 11/2/17.
 * Write a program that asks a user for the number of miles they have driven
 * and the amount of gas they've consumed (in gallons), and print their miles-per-gallon.
 */
public class Alice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter miles: ");
        double miles = reader.nextDouble();
        System.out.println("Enter amount of gas in gallons consumed: ");
        double gallons = reader.nextDouble();
        reader.close();
        double mpg = miles / gallons;
        System.out.println("MPG: " + mpg);
    }
}