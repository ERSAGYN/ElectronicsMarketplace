package org.example.electronics.mobile.smartphones;

import org.example.electronics.mobile.Mobile;

public class Smartphone extends Mobile {
    String cameraResolution;
    public Smartphone(double price, String color, boolean wasUsed, String brand, int storageCapacity, String size, String cameraResolution) {
        super(price, color, wasUsed, null, storageCapacity, size);
        this.cameraResolution = cameraResolution;
    }
}
