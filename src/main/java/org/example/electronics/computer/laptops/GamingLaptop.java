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

    public void saveDB() {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(this);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static List<GamingLaptop> getGamingLaptopsDB() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //return session.get(Car.class,0); // return one object
            return session.createQuery("from GamingLaptop", GamingLaptop.class).list(); // return list of objects
        }
    }
}
