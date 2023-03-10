package org.example.electronics.mobile.smartphones.android;

import jakarta.persistence.Entity;

@Entity
public class Xiaomi extends Android{
    boolean isRedmi;

    public Xiaomi(double price, String color, boolean wasUsed, String size, String cameraResolution, String androidVersion, boolean isRedmi) {
        super(price, color, wasUsed, size, cameraResolution, androidVersion);
        this.isRedmi = isRedmi;
    }

    public boolean getIsRedmi(){
        return isRedmi;
    }

    public void setRedmi(boolean isRedmi) {
        isRedmi = isRedmi;
    }

    public Xiaomi() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + "\t" + getSize() + "\t" + getCameraResolution() + "\t" + getAndroidVersion() + "\t" + getSize() + "\t" + getIsRedmi());
    }
}
