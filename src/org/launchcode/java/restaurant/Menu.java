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

}
