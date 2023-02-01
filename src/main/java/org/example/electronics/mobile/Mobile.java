package org.example.electronics.mobile;

import org.example.electronics.Electronics;

public class Mobile extends Electronics {
    String size;
    public Mobile(double price, String color, boolean wasUsed, String brand, int storageCapacity, String size) {
        super(price, color, wasUsed, brand);
        this.size = size;
    }
}
