package org.example.electronics.computer.monoblocks;

import org.example.electronics.ElectronicsBuilder;
import org.example.electronics.interfaces.IMonoblockBuilder;

public class MonoblockBuilder extends ElectronicsBuilder implements IMonoblockBuilder {
    Monoblock monoblock = new Monoblock();

    @Override
    public IMonoblockBuilder setPrice(double price) {
        monoblock.setPrice(price);
        return this;
    }

    @Override
    public IMonoblockBuilder setColor(String color) {
        monoblock.setColor(color);
        return this;
    }

    @Override
    public IMonoblockBuilder setWasUsed(boolean wasUsed) {
        monoblock.setWasUsed(wasUsed);
        return this;
    }

    @Override
    public IMonoblockBuilder setBrand(String brand) {
        monoblock.setBrand(brand);
        return this;
    }

    @Override
    public IMonoblockBuilder SetOperationalSystem(String operationalSystem) {
        monoblock.setOperationalSystem(operationalSystem);
        return this;
    }

    @Override
    public IMonoblockBuilder setStorageCapacity(double storageCapacity) {
        monoblock.setStorageCapacity(storageCapacity);
        return this;
    }

    @Override
    public IMonoblockBuilder setGraphicsCard(boolean graphicsCard) {
        monoblock.setGraphicsCard(graphicsCard);
        return this;
    }

    @Override
    public IMonoblockBuilder setProcessor(String processor) {
        monoblock.setProcessor(processor);
        return this;
    }

    @Override
    public Monoblock build() {
        return monoblock;
    }
}
