package org.launchcode.java.computer;

/**
 * Created by kevinstock on 3/18/17.
 */
public class Smartphone extends Computer {

    private boolean hasCompas;
    private boolean hasAccelerometer;
    private String mobileNetworkType;
    private int batteryLifeInHours;

    public Smartphone(String brand, String model,
                      String cpu, int ram, String storage, String os,
                      boolean hasCompas, boolean hasAccelerometer,
                      String mobileNetworkType, int batteryLifeInHours) {
        super(brand, model, cpu, ram, storage, os);
        this.hasCompas = hasCompas;
        this.hasAccelerometer = hasAccelerometer;
        this.mobileNetworkType = mobileNetworkType;
        this.batteryLifeInHours = batteryLifeInHours;
    }
}
