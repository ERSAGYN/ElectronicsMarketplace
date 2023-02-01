package org.example.electronics;

abstract public class Electronics {
    protected double price;
    protected String color;
    protected boolean wasUsed;
    protected String brand;

    public Electronics(double price, String color, boolean wasUsed, String brand) {
        this.wasUsed = wasUsed;
        this.price = wasUsed? (price) - (price*0.1) : price;
        this.color = color;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean wasUsed() {
        return wasUsed;
    }

    public String getBrand() {
        return brand;
    }

}
