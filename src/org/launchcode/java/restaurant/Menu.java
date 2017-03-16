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
    public Date created = new Date();
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

    public void removeItemFromMenu(MenuItem item) {
        this.menuItems.remove(item);
        this.setLastUpdate(new Date());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (!name.equals(menu.name)) return false;
        return created.equals(menu.created);
    }

    @Override
    public String toString() {

        String text = "Menu Name: " + name + "\n" +
                "Created: " + created + "\n" +
                "Last Updated: " + lastUpdate + "\n" +
                "Menu Items:\n";
        for (MenuItem item : menuItems) {
            text += "\tName: " + item.getName() + "\n" +
                    "\tPrice: $" + item.getPrice() + "\n" +
                    "\tDescription: " + item.getDescription() + "\n" +
                    "\tCreated: " + item.getCreated() + "\n\n";
        }
        return text;
    }

}
