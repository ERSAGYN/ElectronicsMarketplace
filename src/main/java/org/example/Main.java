package org.example;

import org.example.HibernateUtil.DatabaseSave;
import org.example.electronics.Electronics;
import org.example.electronics.computer.laptops.GamingLaptop;
import org.example.electronics.computer.laptops.HomeLaptop;
import org.example.electronics.computer.laptops.WorkLaptop;
import org.example.electronics.computer.monoblocks.Monoblock;
import org.example.electronics.computer.peripheral.Keyboard;
import org.example.electronics.computer.peripheral.Monitor;
import org.example.electronics.computer.peripheral.Mouse;
import org.example.electronics.mobile.accessories.Charger;
import org.example.electronics.mobile.accessories.Headphone;
import org.example.electronics.mobile.accessories.PhoneCase;
import org.example.electronics.mobile.gadgets.ElectronicBook;
import org.example.electronics.mobile.gadgets.FitnessBracelet;
import org.example.electronics.mobile.gadgets.SmartWatch;
import org.example.electronics.mobile.smartphones.android.Huawei;
import org.example.electronics.mobile.smartphones.android.Oppo;
import org.example.electronics.mobile.smartphones.android.Samsung;
import org.example.electronics.mobile.smartphones.android.Xiaomi;
import org.example.electronics.mobile.smartphones.ios.Apple;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Electronics> electronicsArrayList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(GamingLaptop.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(HomeLaptop.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(WorkLaptop.class));

        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Monoblock.class));

        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Keyboard.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Monitor.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Mouse.class));

        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Charger.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Headphone.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(PhoneCase.class));

        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(ElectronicBook.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(FitnessBracelet.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(SmartWatch.class));

        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Huawei.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Oppo.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Samsung.class));
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Xiaomi.class));

        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Apple.class));
        //electronicsArrayList.add(new GamingLaptop(200, "nono", false, "NOT CHANGED", "Windows", 512, "Intel Core i5"));
        //electronicsArrayList.add(new Huawei(200, "red", false, "55x55", "Windows", "9.1", false));
        /*for(Electronics e: electronicsArrayList){
            DatabaseSave.save(e);
        }*/
        /*
        * Итак что делать
        * 1. Вывести список электроники
        * 2. Удалить объект с базы данных
        * 3. Изменить объект
        * 4. Выйти
        *
        * (3) getClass
        *
        * method Huawei(){
        * Scan.nextInt = number;
        * switch(number)
        *}
        *   method Electronics{
        *       sout("1. Цвет")
        *       sout("2. Бренд")
        *   }
        * }
        * 1. Цвет
        * 2. Бренд
        * Введите цвет: + setColor;
        * */
        /*for(Electronics e: electronicsArrayList){
            DatabaseSave.save(e);
        }*/
        mainMenu();

    }

    static void printOut() {
        int count = 0;
        for(Electronics e: electronicsArrayList) {
            System.out.print(count + "\t");
            e.print();
            count++;
        }
        mainMenu();
    }

    static void deleteObject() {
        System.out.println("Введите ID объекта для удаления: ");
        int number = scan.nextInt();
        DatabaseSave.delete(electronicsArrayList.get(number));
        electronicsArrayList.remove(number);
        System.out.println("Deleted successfully");
        mainMenu();
    }
    static void mainMenu() {
        System.out.println("1. Вывести список электроники.\n2. Удалить объект с базы данных.\n3. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                printOut();
                break;
            case 2:
                deleteObject();
                break;
            case 3:
                break;
        }
    }
}