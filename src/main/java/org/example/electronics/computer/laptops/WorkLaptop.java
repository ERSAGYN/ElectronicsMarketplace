package org.example.electronics.computer.laptops;

import jakarta.persistence.Entity;

@Entity
public class WorkLaptop extends Laptop{
    String password;
    public WorkLaptop(double price, String color, boolean wasUsed, String brand, String operationalSystem, double storageCapacity, String password) {
        super(price, color, wasUsed, brand, operationalSystem, storageCapacity, false);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public WorkLaptop() {
    }
}
