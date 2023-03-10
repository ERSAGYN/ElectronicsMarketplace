package org.example.electronics.computer.peripheral;

import jakarta.persistence.Entity;

@Entity
public class Monitor extends Peripheral{
    double inches;

    public Monitor(double price, String color, boolean wasUsed, String brand, String operationalSystem, boolean hasBluetooth, double inches) {
        super(price, color, wasUsed, brand, operationalSystem, hasBluetooth);
        this.inches = inches;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public Monitor() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + getOperationalSystem() + "\t" + getInches());
    }
}
