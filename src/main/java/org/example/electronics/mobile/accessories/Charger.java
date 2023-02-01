package org.example.electronics.mobile.accessories;

import jakarta.persistence.Entity;

@Entity
public class Charger extends Accessory{
    double volt;

    public Charger(double price, String color, boolean wasUsed, String brand, String size, boolean madeInChina, double volt) {
        super(price, color, wasUsed, brand, size, madeInChina);
        this.volt = volt;
    }
}
