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

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setGraphicsCard(boolean graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public String getProcessor() {
        return processor;
    }

    public boolean getGraphicsCard(){
        return graphicsCard;
    }

    public Monoblock() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getStorageCapacity() + "\t" + getColor() + "\t" + getGraphicsCard() + "\t" + getOperationalSystem() + getStorageCapacity() + getProcessor());
    }
}
