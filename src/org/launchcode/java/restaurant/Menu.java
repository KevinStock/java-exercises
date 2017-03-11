package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by kevinstock on 3/11/17.
 */
public class Menu {

    private String name;
    public ArrayList<MenuItem> menuItems = new ArrayList<>();
    public Date lastUpdate = new Date();

    public Menu(String name) {
        this.name = name;
        this.menuItems = menuItems;
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void addItemToMenu(MenuItem item) {
        this.menuItems.add(item);
        this.setLastUpdate(new Date());
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public static void main(String[] args) {
        Menu breakfastMenu = new Menu("Brekfast");
        MenuItem mi1 = new MenuItem("Pancakes", 2.75, "Stack of 3 Homestyle Pancakes", "Main");
        System.out.println(breakfastMenu.getMenuItems().toString());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MenuItem mi2 = new MenuItem("Sausage", 1.50, "2 Sausage Links", "Side");
        System.out.println(breakfastMenu.getLastUpdate());
        breakfastMenu.addItemToMenu(mi1);
        breakfastMenu.addItemToMenu(mi2);
        Menu lunchMenu = new Menu("Lunch");
        MenuItem mi3 = new MenuItem("Grilled Cheese Sandwich", 1.75, "Grilled Cheese on White Bread", "Main");
        lunchMenu.addItemToMenu(mi3);
        System.out.println(breakfastMenu.getMenuItems().toString());
        System.out.println(lunchMenu.getMenuItems().toString());
        breakfastMenu.getMenuItems().get(0).isNewItem();
    }
}
