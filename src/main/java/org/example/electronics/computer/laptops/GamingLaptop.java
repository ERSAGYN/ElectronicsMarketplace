package org.example.electronics.computer.laptops;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.HibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@Entity
public class GamingLaptop extends Laptop{
    String processor;
    public GamingLaptop(double price, String color, boolean wasUsed, String brand, String operationalSystem, double storageCapacity, String processor) {
        super(price, color, wasUsed, brand, operationalSystem, storageCapacity, true);
        this.processor = processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public GamingLaptop() {

    }

    @Override
    public void print() {
        System.out.println(getId() + "\t" + getBrand() + "\t" + getPrice() + "\t" + getStorageCapacity() + "\t" + getColor() + "\t" + getGraphicsCard() + "\t" + getOperationalSystem() + "\t" + getProcessor());
    }
}
