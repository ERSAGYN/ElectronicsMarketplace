package org.example.electronics.mobile.gadgets;

import jakarta.persistence.Entity;

@Entity
public class ElectronicBook extends Gadget{
    boolean backlight;

    public ElectronicBook(double price, String color, boolean wasUsed, String brand, String size, String operationSystem, double workingTime, boolean backlight) {
        super(price, color, wasUsed, brand, size, operationSystem, workingTime);
        this.backlight = backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean getBackLight(){
        return backlight;
    }
    public ElectronicBook() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + "\t" + getSize() + "\t" + getOperationSystem() + "\t" + getSize() + "\t" + getBackLight());
    }
}
