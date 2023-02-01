package org.example.electronics;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
abstract public class Electronics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected double price;
    protected String color;
    protected boolean wasUsed;
    protected String brand;

    public Electronics(double price, String color, boolean wasUsed, String brand) {
        this.wasUsed = wasUsed;
        this.price = wasUsed? (price) - (price*0.1) : price;
        this.color = color;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean wasUsed() {
        return wasUsed;
    }

    public String getBrand() {
        return brand;
    }

}
