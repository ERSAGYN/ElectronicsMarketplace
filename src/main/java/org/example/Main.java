package org.example;

public class Main {
    public static void main(String[] args) {
        Person ersa = new Person("Emae", 16, false);
        Car c = new Car();
        System.out.println(Person.getStudentsDB().get(2).getAge());
        //System.out.println(getCar().getModel());
        ersa.saveDB();
        c.saveDB();
        //saveCarDB(c);

    }
}