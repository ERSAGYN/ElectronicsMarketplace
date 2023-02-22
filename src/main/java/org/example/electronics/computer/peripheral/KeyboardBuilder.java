package org.example.electronics.computer.peripheral;

import org.example.electronics.ElectronicsBuilder;
import org.example.electronics.interfaces.IKeyboardBuilder;

public class KeyboardBuilder extends ElectronicsBuilder implements IKeyboardBuilder {
    Keyboard keyboard = new Keyboard();
    @Override
    public KeyboardBuilder setPrice(double price) {
        keyboard.setPrice(price);
        return this;
    }

    @Override
    public KeyboardBuilder setColor(String color) {
        keyboard.setColor(color);
        return this;
    }

    @Override
    public KeyboardBuilder setWasUsed(boolean wasUsed) {
        keyboard.setWasUsed(wasUsed);
        return this;
    }

    @Override
    public KeyboardBuilder setBrand(String brand) {
        keyboard.setBrand(brand);
        return this;
    }

    @Override
    public KeyboardBuilder setOperationalSystem(String operationalSystem) {
        keyboard.setOperationalSystem(operationalSystem);
        return this;
    }

    @Override
    public KeyboardBuilder setHasBluetooth(boolean hasBluetooth) {
        keyboard.setHasBluetooth(hasBluetooth);
        return this;
    }

    @Override
    public KeyboardBuilder setBacklight(boolean backlight) {
        keyboard.setBacklight(backlight);
        return this;
    }

    @Override
    public Keyboard build() {
        return keyboard;
    }
}
