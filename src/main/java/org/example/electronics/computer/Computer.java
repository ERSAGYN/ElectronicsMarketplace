package org.example.electronics.computer;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.Electronics;
@MappedSuperclass
abstract public class Computer extends Electronics {
    String operationalSystem;
    public Computer(double price, String color, boolean wasUsed, String brand, String operationalSystem) {
        super(price, color, wasUsed, brand);
        this.operationalSystem = operationalSystem;
    }

    public Computer() {
    }
}
