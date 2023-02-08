package org.example.electronics.mobile.smartphones.ios;

import jakarta.persistence.Entity;

@Entity
public class Apple extends IOS{
    double year;

    public Apple(double price, String color, boolean wasUsed, String size, String cameraResolution, String versionIOS, double year) {
        super(price, color, wasUsed, size, cameraResolution, versionIOS);
        this.year = year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getYear() {
        return year;
    }

    public Apple() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + "\t" + getSize() + "\t" + getCameraResolution() + "\t" + getVersionIOS() + "\t" + getSize() + "\t" + getYear());
    }
}
