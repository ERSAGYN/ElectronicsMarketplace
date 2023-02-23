package org.example.electronics.interfaces;

import org.example.electronics.computer.peripheral.Mouse;

public interface IMouseBuilder {
    IMouseBuilder setPrice(double price);
    IMouseBuilder setColor(String color);
    IMouseBuilder setWasUsed(boolean wasUsed);
    IMouseBuilder setBrand(String brand);
    IMouseBuilder setOperationalSystem(String operationalSystem);
    IMouseBuilder setHasBluetooth(boolean hasBluetooth);
    IMouseBuilder setOptical(boolean optical);
    Mouse build();
}
