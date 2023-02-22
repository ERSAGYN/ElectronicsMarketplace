package org.example.electronics.interfaces;

import org.example.electronics.computer.laptops.Laptop;

public interface ILaptopBuilder {
    ILaptopBuilder setPrice(double price);
    ILaptopBuilder setColor(String color);
    ILaptopBuilder setWasUsed(boolean wasUsed);
    ILaptopBuilder setBrand(String brand);
    ILaptopBuilder setOperationalSystem(String operationalSystem);
    ILaptopBuilder setStorageCapacity(double storageCapacity);
    ILaptopBuilder setGraphicsCard(boolean graphicsCard);
    Laptop build();
}
