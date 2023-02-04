package org.example.electronics.computer.laptops;

import jakarta.persistence.Entity;

@Entity
public class HomeLaptop extends Laptop{
    boolean graphicsCard;
    public HomeLaptop(double price, String color, boolean wasUsed, String brand, String operationalSystem, double storageCapacity, boolean graphicsCard) {
        super(price, color, wasUsed, brand, operationalSystem, storageCapacity, graphicsCard);
    }

    public HomeLaptop() {
    }
}
