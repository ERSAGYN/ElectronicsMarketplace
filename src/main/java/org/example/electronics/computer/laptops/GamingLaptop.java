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

    public String getProcessor() {
        return processor;
    }

    public GamingLaptop() {

    }

    public static List<GamingLaptop> getGamingLaptopsDB() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //return session.get(Car.class,0); // return one object
            return session.createQuery("from GamingLaptop", GamingLaptop.class).list(); // return list of objects
        }
    }
}
