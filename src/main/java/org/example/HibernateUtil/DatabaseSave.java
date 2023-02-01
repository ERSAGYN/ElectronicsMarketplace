package org.example.HibernateUtil;

import org.example.electronics.Electronics;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DatabaseSave {
    public static void save(Electronics electronics) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(electronics);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
