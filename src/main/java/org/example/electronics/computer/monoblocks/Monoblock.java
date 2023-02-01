package org.example.electronics.computer.monoblocks;

import jakarta.persistence.Entity;
import org.example.electronics.computer.Computer;
@Entity
public class Monoblock extends Computer {
    double storageCapacity;
    boolean graphicsCard;
    String processor;

    public Monoblock(double price, String color, boolean wasUsed, String brand, String operationalSystem, double storageCapacity, boolean graphicsCard, String processor) {
        super(price, color, wasUsed, brand, operationalSystem);
        this.storageCapacity = storageCapacity;
        this.graphicsCard = graphicsCard;
        this.processor = processor;
    }
}
