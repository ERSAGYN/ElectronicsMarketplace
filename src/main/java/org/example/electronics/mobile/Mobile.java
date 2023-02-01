package org.example.electronics.mobile;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.Electronics;
@MappedSuperclass
abstract public class Mobile extends Electronics {
    String size;
    public Mobile(double price, String color, boolean wasUsed, String brand, String size) {
        super(price, color, wasUsed, brand);
        this.size = size;
    }
}
