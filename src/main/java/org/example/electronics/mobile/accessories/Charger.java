package org.example.electronics.mobile.accessories;

import jakarta.persistence.Entity;

@Entity
public class Charger extends Accessory{
    double volt;

    public Charger(double price, String color, boolean wasUsed, String brand, String size, boolean madeInChina, double volt) {
        super(price, color, wasUsed, brand, size, madeInChina);
        this.volt = volt;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public Charger() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + "\t" + getSize() + "\t" + getMadeInChina() + "\t" + getVolt());
    }
}
