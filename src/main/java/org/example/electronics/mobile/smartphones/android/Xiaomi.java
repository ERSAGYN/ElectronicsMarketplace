package org.example.electronics.mobile.smartphones.android;

import jakarta.persistence.Entity;

@Entity
public class Xiaomi extends Android{
    boolean isRedmi;

    public Xiaomi(double price, String color, boolean wasUsed, String size, String cameraResolution, String androidVersion, boolean isRedmi) {
        super(price, color, wasUsed, size, cameraResolution, androidVersion);
        this.isRedmi = isRedmi;
    }

    public Xiaomi() {
    }
}
