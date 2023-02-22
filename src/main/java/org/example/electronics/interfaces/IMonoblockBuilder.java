package org.example.electronics.interfaces;

import org.example.electronics.computer.laptops.Laptop;
import org.example.electronics.computer.monoblocks.Monoblock;

public interface IMonoblockBuilder {
    IMonoblockBuilder setPrice(double price);
    IMonoblockBuilder setColor(String color);
    IMonoblockBuilder setWasUsed(boolean wasUsed);
    IMonoblockBuilder setBrand(String brand);
    IMonoblockBuilder SetOperationalSystem(String operationalSystem);
    IMonoblockBuilder setStorageCapacity(double storageCapacity);
    IMonoblockBuilder setGraphicsCard(boolean graphicsCard);
    IMonoblockBuilder setProcessor(String processor);
    Monoblock build();
}
