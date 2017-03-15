package org.launchcode.java.restaurant;

import java.util.concurrent.TimeUnit;

/**
 * Created by kevinstock on 3/15/17.
 */
public class Restaurant {


    public static void main(String[] args) {
        Menu breakfastMenu = new Menu("Breakfast");
        MenuItem mi1 = new MenuItem("Pancakes", 2.75, "Stack of 3 Homestyle Pancakes", "Main");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MenuItem mi2 = new MenuItem("Sausage", 1.50, "2 Sausage Links", "Side");

        breakfastMenu.addItemToMenu(mi1);
        breakfastMenu.addItemToMenu(mi2);


        Menu lunchMenu = new Menu("Lunch");
        MenuItem mi3 = new MenuItem("Grilled Cheese Sandwich", 1.75, "Grilled Cheese on White Bread", "Main");
        lunchMenu.addItemToMenu(mi3);

        System.out.println(mi1.toString());
        System.out.println(mi2.toString());

        System.out.println("-----------------------");
        System.out.println(breakfastMenu.toString());
        System.out.println(lunchMenu.toString());
        breakfastMenu.removeItemFromMenu(mi2);
        System.out.println(breakfastMenu.toString());
    }
}
