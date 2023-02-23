package org.example.electronics.computer.peripheral;

import org.example.electronics.interfaces.IMouseBuilder;

public class MouseBuilder implements IMouseBuilder {
    Mouse mouse = new Mouse();
    @Override
    public IMouseBuilder setPrice(double price) {
        mouse.setPrice(price);
        return this;
    }

    @Override
    public IMouseBuilder setColor(String color) {
        mouse.setColor(color);
        return this;
    }

    @Override
    public IMouseBuilder setWasUsed(boolean wasUsed) {
        mouse.setWasUsed(wasUsed);
        return this;
    }

    @Override
    public IMouseBuilder setBrand(String brand) {
        mouse.setBrand(brand);
        return this;
    }

    @Override
    public IMouseBuilder setOperationalSystem(String operationalSystem) {
        mouse.setOperationalSystem(operationalSystem);
        return this;
    }

    @Override
    public IMouseBuilder setHasBluetooth(boolean hasBluetooth) {
        mouse.setHasBluetooth(hasBluetooth);
        return this;
    }

    @Override
    public IMouseBuilder setOptical(boolean optical) {
        mouse.setOptical(optical);
        return this;
    }

    @Override
    public Mouse build() {
        return mouse;
    }
}
