package org.launchcode.java.computer;

/**
 * Created by kevinstock on 3/18/17.
 */
public class Laptop extends Computer {

    private double screenSize;
    private boolean hasTouchscreen;
    private int numUsbPorts;

    public Laptop(String brand, String model,
                  String cpu, int ram,
                  String storage, String os,
                  double screenSize, boolean hasTouchscreen,
                  int numUsbPorts) {
        super(brand, model, cpu, ram, storage, os);
        this.screenSize = screenSize;
        this.hasTouchscreen = hasTouchscreen;
        this.numUsbPorts = numUsbPorts;
    }
}
