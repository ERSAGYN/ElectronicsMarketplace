package org.example.electronics.mobile.accessories;

import jakarta.persistence.Entity;

@Entity
public class PhoneCase extends Accessory{
    String material;

    public PhoneCase(double price, String color, boolean wasUsed, String brand, String size, boolean madeInChina, String material) {
        super(price, color, wasUsed, brand, size, madeInChina);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public PhoneCase() {
    }
}
