package org.example.electronics.computer.laptops;

import org.example.electronics.ElectronicsBuilder;
import org.example.electronics.interfaces.ILaptopBuilder;

public class LaptopBuilder extends ElectronicsBuilder implements ILaptopBuilder {
    Laptop laptop = new Laptop();

    @Override
    public ILaptopBuilder setPrice(double price) {
        laptop.setPrice(price);
        return this;
    }

    @Override
    public ILaptopBuilder setColor(String color) {
        laptop.setColor(color);
        return this;
    }

    @Override
    public ILaptopBuilder setWasUsed(boolean wasUsed) {
        laptop.setWasUsed(wasUsed);
        return this;
    }

    @Override
    public ILaptopBuilder setBrand(String brand) {
        laptop.setBrand(brand);
        return this;
    }

    @Override
    public ILaptopBuilder setOperationalSystem(String operationalSystem) {
        laptop.setOperationalSystem(operationalSystem);
        return this;
    }

    @Override
    public ILaptopBuilder setStorageCapacity(double storageCapacity) {
        laptop.setStorageCapacity(storageCapacity);
        return this;
    }

    @Override
    public ILaptopBuilder setGraphicsCard(boolean graphicsCard) {
        laptop.setGraphicsCard(graphicsCard);
        return this;
    }

    @Override
    public Laptop build() {
        return laptop;
    }
}
