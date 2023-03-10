package org.example.electronics.mobile.smartphones.android;

import jakarta.persistence.Entity;

@Entity
public class Huawei extends Android{
    boolean hasHarmonyOS;

    public Huawei(double price, String color, boolean wasUsed, String size, String cameraResolution, String androidVersion, boolean hasHarmonyOS) {
        super(price, color, wasUsed, size, cameraResolution, androidVersion);
        this.hasHarmonyOS = hasHarmonyOS;
    }

    public boolean getHasHarmonyOS(){
        return hasHarmonyOS;
    }

    public void setHasHarmonyOS(boolean hasHarmonyOS) {
        this.hasHarmonyOS = hasHarmonyOS;
    }

    public Huawei() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + "\t" + getSize() + "\t" + getCameraResolution() + "\t" + getAndroidVersion() + "\t" + getSize() + "\t" + getHasHarmonyOS());
    }
}
