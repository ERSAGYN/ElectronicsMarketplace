package org.example.electronics.interfaces;

import org.example.electronics.computer.peripheral.Keyboard;
import org.example.electronics.computer.peripheral.KeyboardBuilder;

public interface IKeyboardBuilder {
    KeyboardBuilder setPrice(double price);
    KeyboardBuilder setColor(String color);
    KeyboardBuilder setWasUsed(boolean wasUsed);
    KeyboardBuilder setBrand(String brand);
    KeyboardBuilder setOperationalSystem(String operationalSystem);
    KeyboardBuilder setHasBluetooth(boolean hasBluetooth);
    KeyboardBuilder setBacklight(boolean backlight);
    Keyboard build();
}
