package org.example.electronics.computer.peripheral;

import jakarta.persistence.Entity;

@Entity
public class Monitor extends Peripheral{
    double inches;

    public Monitor(double price, String color, boolean wasUsed, String brand, String operationalSystem, boolean hasBluetooth, double inches) {
        super(price, color, wasUsed, brand, operationalSystem, hasBluetooth);
        this.inches = inches;
    }
}
