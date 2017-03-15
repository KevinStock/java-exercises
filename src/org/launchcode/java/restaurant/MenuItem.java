package org.launchcode.java.restaurant;

import java.util.Date;

/**
 * Created by kevinstock on 3/11/17.
 */
public class MenuItem {

    // Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private String name;
    private double price;
    private String description;
    private String category;
    private Date created = new Date();

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        long diff =  new Date().getTime() - this.created.getTime();
        System.out.println(diff);
        if (diff < 10000) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", created=" + created +
                '}';
    }
}