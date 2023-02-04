package org.example.electronics.mobile.gadgets;

import jakarta.persistence.Entity;

@Entity
public class FitnessBracelet extends Gadget{
    boolean hasPressureMeter;

    public FitnessBracelet(double price, String color, boolean wasUsed, String brand, String size, String operationSystem, double workingTime, boolean hasPressureMeter) {
        super(price, color, wasUsed, brand, size, operationSystem, workingTime);
        this.hasPressureMeter = hasPressureMeter;
    }

    public void setHasPressureMeter(boolean hasPressureMeter) {
        this.hasPressureMeter = hasPressureMeter;
    }

    public boolean getHasPressureMeter(){
        return hasPressureMeter;
    }

    public FitnessBracelet() {
    }
}
