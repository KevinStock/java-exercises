package org.launchcode.java.computer;

/**
 * Created by kevinstock on 3/18/17.
 */
public abstract class Computer extends AbstractEntity {

    private String brand;
    private String model;
    private String cpu;
    private int ram;
    private String storage;
    private String os;

    public Computer(String brand, String model,
                    String cpu, int ram,
                    String storage, String os) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
    }

    @Override
    public String toString() {
        return "(" + id + ") " + brand + " " + model + "\n" +
                "\tCPU: " + cpu + "\n" +
                "\tRAM: " + ram + "\n" +
                "\tStorage: " + storage + "\n" +
                "\tOS: " + os + "\n";
    }



}
