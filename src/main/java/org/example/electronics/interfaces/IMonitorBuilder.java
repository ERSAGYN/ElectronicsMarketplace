package org.example.electronics.interfaces;

import org.example.electronics.computer.peripheral.Monitor;

public interface IMonitorBuilder {
    IMonitorBuilder setPrice(double price);
    IMonitorBuilder setColor(String color);
    IMonitorBuilder setWasUsed(boolean wasUsed);
    IMonitorBuilder setBrand(String brand);
    IMonitorBuilder setOperationalSystem(String operationalSystem);
    IMonitorBuilder setHasBluetooth(boolean hasBluetooth);
    IMonitorBuilder setInches(double inches);
    Monitor build();
}
