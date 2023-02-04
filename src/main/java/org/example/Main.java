package org.example;

import org.example.HibernateUtil.DatabaseSave;
import org.example.electronics.Electronics;
import org.example.electronics.computer.laptops.GamingLaptop;
import org.example.electronics.mobile.smartphones.android.Huawei;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Person ersa = new Person("Emae", 16, false);
        //Car c = new Car();
        //System.out.println(Person.getStudentsDB().get(2).getAge());
        //System.out.println(getCar().getModel());
        //ersa.saveDB();
        //c.saveDB();
        //saveCarDB(c);
        ArrayList<Electronics> electronicsArrayList = new ArrayList<>();
        //electronicsArrayList.add(new GamingLaptop(200, "nono", false, "NOT CHANGED", "Windows", 512, "Intel Core i5"));
        //electronicsArrayList.add(new Huawei(200, "red", false, "55x55", "Windows", "9.1", false));
        /*for(Electronics e: electronicsArrayList){
            DatabaseSave.save(e);
        }*/

        for (Electronics e: DatabaseSave.getDataFromDB(GamingLaptop.class)) {
            electronicsArrayList.add(e);
        }
        for(Electronics e: electronicsArrayList){
            e.setColor("CHANGED");
        }
        for(Electronics e: electronicsArrayList){
            DatabaseSave.save(e);
        }
    }
}