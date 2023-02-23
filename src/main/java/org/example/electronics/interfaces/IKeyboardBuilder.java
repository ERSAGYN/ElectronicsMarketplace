package org.example.electronics.interfaces;

import org.example.electronics.computer.peripheral.Keyboard;
import org.example.electronics.computer.peripheral.KeyboardBuilder;

public interface IKeyboardBuilder {
    IKeyboardBuilder setPrice(double price);
    IKeyboardBuilder setColor(String color);
    IKeyboardBuilder setWasUsed(boolean wasUsed);
    IKeyboardBuilder setBrand(String brand);
    IKeyboardBuilder setOperationalSystem(String operationalSystem);
    IKeyboardBuilder setHasBluetooth(boolean hasBluetooth);
    IKeyboardBuilder setBacklight(boolean backlight);
    Keyboard build();
}
