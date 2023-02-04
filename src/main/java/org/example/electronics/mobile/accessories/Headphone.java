package org.example.electronics.mobile.accessories;

import jakarta.persistence.Entity;

@Entity
public class Headphone extends Accessory{
    boolean wireless;
    public Headphone(double price, String color, boolean wasUsed, String brand, String size, boolean madeInChina, boolean wireless) {
        super(price, color, wasUsed, brand, size, madeInChina);
        this.wireless = wireless;
    }

    public boolean getWireless(){
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public Headphone() {
    }
}
