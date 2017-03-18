package org.launchcode.java.computer;

/**
 * Created by kevinstock on 3/18/17.
 */
public class Program {
    public static void main(String[] args) {
        Computer c1 = new Desktop("Apple",
                "iMac",
                "2.8 GHz Intel Core i7",
                12,
                "1TB",
                "OS X",
                true,
                false);
        Computer c2 = new Laptop("Apple",
                "Macbook Air",
                "1.7 GHz Intel Core i7",
                8,
                "250GB",
                "OS X",
                13.1,
                false,
                3);
        Computer c3 = new Smartphone("Apple",
                "Macbook Air",
                "1.7 GHz Intel Core i7",
                8,
                "250GB",
                "OS X",
                true,
                true,
                "4G / LTE",
                30);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c1.toString());
    }
}
