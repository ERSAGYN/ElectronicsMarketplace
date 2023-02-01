package org.example.electronics.mobile.accessories;

import jakarta.persistence.Entity;

@Entity
public class PhoneCase extends Accessory{
    String material;

    public PhoneCase(double price, String color, boolean wasUsed, String brand, String size, boolean madeInChina, String material) {
        super(price, color, wasUsed, brand, size, madeInChina);
        this.material = material;
    }
}
