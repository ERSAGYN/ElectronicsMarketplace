package org.example.electronics.mobile.gadgets;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.mobile.Mobile;
@MappedSuperclass
abstract public class Gadget extends Mobile {
    String operationSystem;
    double workingTime;

    public Gadget(double price, String color, boolean wasUsed, String brand, String size, String operationSystem, double workingTime) {
        super(price, color, wasUsed, brand, size);
        this.operationSystem = operationSystem;
        this.workingTime = workingTime;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public Gadget() {
    }
}
