package org.example.electronics.mobile.smartphones.android;

import jakarta.persistence.Entity;

@Entity
public class Samsung extends Android{
    boolean isFlagman;

    public Samsung(double price, String color, boolean wasUsed, String size, String cameraResolution, String androidVersion, boolean isFlagman) {
        super(price, color, wasUsed, size, cameraResolution, androidVersion);
        this.isFlagman = isFlagman;
    }

    public boolean getIsFlagman(){
        return isFlagman;
    }

    public void setFlagman(boolean isFlagman) {
        isFlagman = isFlagman;
    }

    public Samsung() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + "\t" + getSize() + "\t" + getCameraResolution() + "\t" + getAndroidVersion() + "\t" + getSize() + "\t" + getIsFlagman());
    }
}
