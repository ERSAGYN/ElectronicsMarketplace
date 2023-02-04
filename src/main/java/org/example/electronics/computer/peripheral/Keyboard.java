package org.example.electronics.computer.peripheral;

import jakarta.persistence.Entity;

@Entity
public class Keyboard extends Peripheral{
    boolean backlight;

    public Keyboard(double price, String color, boolean wasUsed, String brand, String operationalSystem, boolean hasBluetooth, boolean backlight) {
        super(price, color, wasUsed, brand, operationalSystem, hasBluetooth);
        this.backlight = backlight;
    }
    public boolean getBacklight(){
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public Keyboard() {
    }
}
