package org.example.electronics.computer.laptops;

import jakarta.persistence.Entity;
import org.example.electronics.computer.Computer;
@Entity
public class Laptop extends Computer {
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

    @Override
    public void print() {
        System.out.println("Laptop{" +
                "storageCapacity=" + storageCapacity +
                ", graphicsCard=" + graphicsCard +
                ", id=" + id +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", wasUsed=" + wasUsed +
                ", brand='" + brand + '\'' +
                '}');
    }
}
