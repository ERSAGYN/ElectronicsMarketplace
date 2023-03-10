package org.example.electronics.computer.peripheral;

import jakarta.persistence.Entity;

@Entity
public class Mouse extends Peripheral{
    boolean optical;

    public Mouse(double price, String color, boolean wasUsed, String brand, String operationalSystem, boolean hasBluetooth, boolean optical) {
        super(price, color, wasUsed, brand, operationalSystem, hasBluetooth);
        this.optical = optical;
    }

    public boolean getOptical(){
        return optical;
    }

    public void setOptical(boolean optical) {
        this.optical = optical;
    }

    public Mouse() {
    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getColor() + getOperationalSystem() + "\t" + getOptical());
    }
}
