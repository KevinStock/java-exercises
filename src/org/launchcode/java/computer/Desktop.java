package org.launchcode.java.computer;

/**
 * Created by kevinstock on 3/18/17.
 */
public class Desktop extends Computer {

    private boolean isAllInOne;
    private boolean hasLiquidCooling;

    public Desktop(String brand, String name, String cpu,
                   int ram, String storage, String os,
                   boolean isAllInOne, boolean hasLiquidCooling) {
        super(brand, name, cpu, ram, storage, os);
        this.isAllInOne = isAllInOne;
        this.hasLiquidCooling = hasLiquidCooling;
    }
}
