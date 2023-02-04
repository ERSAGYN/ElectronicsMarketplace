package org.example.electronics.mobile.accessories;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.mobile.Mobile;
@MappedSuperclass
abstract public class Accessory extends Mobile {
    boolean madeInChina;

    public Accessory(double price, String color, boolean wasUsed, String brand, String size, boolean madeInChina) {
        super(price, color, wasUsed, brand, size);
        this.madeInChina = madeInChina;
    }

    public boolean getMadeInChina(){
        return madeInChina;
    }
    public Accessory() {
    }
}
