package org.example.electronics.computer.peripheral;

import org.example.electronics.interfaces.IMonitorBuilder;

public class MonitorBuilder implements IMonitorBuilder {
    Monitor monitor = new Monitor();
    @Override
    public IMonitorBuilder setPrice(double price) {
        monitor.setPrice(price);
        return this;
    }

    @Override
    public IMonitorBuilder setColor(String color) {
        monitor.setColor(color);
        return this;
    }

    @Override
    public IMonitorBuilder setWasUsed(boolean wasUsed) {
        monitor.setWasUsed(wasUsed);
        return this;
    }

    @Override
    public IMonitorBuilder setBrand(String brand) {
        monitor.setBrand(brand);
        return this;
    }

    @Override
    public IMonitorBuilder setOperationalSystem(String operationalSystem) {
        monitor.setOperationalSystem(operationalSystem);
        return this;
    }

    @Override
    public IMonitorBuilder setHasBluetooth(boolean hasBluetooth) {
        monitor.setHasBluetooth(hasBluetooth);
        return this;
    }

    @Override
    public IMonitorBuilder setInches(double inches) {
        monitor.setInches(inches);
        return this;
    }

    @Override
    public Monitor build() {
        return monitor;
    }
}
