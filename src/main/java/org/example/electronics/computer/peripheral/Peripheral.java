package org.example.electronics.computer.peripheral;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.computer.Computer;
@MappedSuperclass
abstract public class Peripheral extends Computer {
    boolean hasBluetooth;

    public Peripheral(double price, String color, boolean wasUsed, String brand, String operationalSystem, boolean hasBluetooth) {
        super(price, color, wasUsed, brand, operationalSystem);
        this.hasBluetooth = hasBluetooth;
    }
}
