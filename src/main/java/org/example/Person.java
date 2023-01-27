package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.example.HibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@Entity
@Table(name = "persontest")

public class Person {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @Column(name="disability")
    private boolean disability;

    public Person(String name, int age, boolean disability){
        this.age = age;
        this.disability = disability;
        this.name = name;
    }

    public Person() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getDisability(){
        return disability;
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

    public static List<Person> getStudentsDB() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Person", Person.class).list();
        }
    }
}
