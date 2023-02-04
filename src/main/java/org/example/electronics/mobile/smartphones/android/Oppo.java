package org.example.electronics.mobile.smartphones.android;

import jakarta.persistence.Entity;

@Entity
public class Oppo extends Android{
    double storageCapacity;

    public Oppo(double price, String color, boolean wasUsed, String size, String cameraResolution, String androidVersion, double storageCapacity) {
        super(price, color, wasUsed, size, cameraResolution, androidVersion);
        this.storageCapacity = storageCapacity;
    }

    public Oppo() {
    }
}
