package org.example.electronics.computer.laptops;

import jakarta.persistence.Entity;

@Entity
public class HomeLaptop extends Laptop{

    public HomeLaptop(double price, String color, boolean wasUsed, String brand, String operationalSystem, double storageCapacity, boolean graphicsCard) {
        super(price, color, wasUsed, brand, operationalSystem, storageCapacity, graphicsCard);
    }

    public void setGraphicsCard(boolean graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public boolean getGraphicsCard(){
        return graphicsCard;
    }
    public HomeLaptop() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getStorageCapacity() + "\t" + getColor() + "\t" + getGraphicsCard() + "\t" + getOperationalSystem());
    }
}
