package org.example.electronics.computer.laptops;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.computer.Computer;
@MappedSuperclass
abstract public class Laptop extends Computer {
    double storageCapacity;
    boolean graphicsCard;

    public Laptop(double price, String color, boolean wasUsed, String brand, String operationalSystem, double storageCapacity, boolean graphicsCard) {
        super(price, color, wasUsed, brand, operationalSystem);
        this.storageCapacity = storageCapacity;
        this.graphicsCard = graphicsCard;
    }

    public void setGraphicsCard(boolean graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }
    public boolean getGraphicsCard(){
        return graphicsCard;
    }

    public Laptop(){
    }
}
