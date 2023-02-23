package org.example;

import org.example.HibernateUtil.DatabaseSave;
import org.example.electronics.Electronics;
import org.example.electronics.ElectronicsBuilder;
import org.example.electronics.computer.laptops.Laptop;
import org.example.electronics.computer.laptops.LaptopBuilder;
import org.example.electronics.computer.monoblocks.Monoblock;
import org.example.electronics.computer.monoblocks.MonoblockBuilder;
import org.example.electronics.computer.peripheral.*;
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

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Electronics> electronicsArrayList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        electronicsArrayList.addAll(DatabaseSave.getDataFromDB(Laptop.class));

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
        //mainMenu();
        //Laptop laptop = new LaptopBuilder().setBrand("ERSA").setPrice(599).build();
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
        System.out.println("1. Вывести список электроники.\n2. Удалить объект с базы данных.\n3.Создать объект.\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                printOut();
                break;
            case 2:
                deleteObject();
                break;
            case 3:
                createObject();
                break;
            case 4:
                break;
        }
    }


    public static void laptopCreator(LaptopBuilder laptopBuilder){
        System.out.println("1. Price.\n2. Color.\n3.Was used.\n4. Brand\n5. Create object\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                double price = scan.nextInt();
                laptopBuilder.setPrice(price);
                break;
            case 2:
                String color = scan.next();
                laptopBuilder.setColor(color);
                break;
            case 3:
                boolean wasUsed = scan.nextBoolean();
                laptopBuilder.setWasUsed(wasUsed);
                break;
            case 4:
                String brand = scan.next();
                laptopBuilder.setBrand(brand);
                break;
            case 5:
                Laptop laptop = laptopBuilder.build();
                DatabaseSave.save(laptop);
                laptop.print();
                return;
            case 6:
                return;
        }
        laptopCreator(laptopBuilder);
    }

    public static void monoblockCreator(MonoblockBuilder monoblockBuilder){
        System.out.println("1. Price.\n2. Color.\n3.Was used.\n4. Brand\n5. Create object\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                double price = scan.nextInt();
                monoblockBuilder.setPrice(price);
                break;
            case 2:
                String color = scan.next();
                monoblockBuilder.setColor(color);
                break;
            case 3:
                boolean wasUsed = scan.nextBoolean();
                monoblockBuilder.setWasUsed(wasUsed);
                break;
            case 4:
                String brand = scan.next();
                monoblockBuilder.setBrand(brand);
                break;
            case 5:
                Monoblock monoblock = monoblockBuilder.build();
                DatabaseSave.save(monoblock);
                monoblock.print();
                return;
            case 6:
                return;
        }
        monoblockCreator(monoblockBuilder);
    }

    public static void keyboardCreator(KeyboardBuilder keyboardBuilder){
        System.out.println("1. Price.\n2. Color.\n3.Was used.\n4. Brand\n5. Create object\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                double price = scan.nextInt();
                keyboardBuilder.setPrice(price);
                break;
            case 2:
                String color = scan.next();
                keyboardBuilder.setColor(color);
                break;
            case 3:
                boolean wasUsed = scan.nextBoolean();
                keyboardBuilder.setWasUsed(wasUsed);
                break;
            case 4:
                String brand = scan.next();
                keyboardBuilder.setBrand(brand);
                break;
            case 5:
                Keyboard keyboard = keyboardBuilder.build();
                DatabaseSave.save(keyboard);
                keyboard.print();
                return;
            case 6:
                return;
        }
        keyboardCreator(keyboardBuilder);
    }
    public static void mouseCreator(MouseBuilder mouseBuilder){
        System.out.println("1. Price.\n2. Color.\n3.Was used.\n4. Brand\n5. Create object\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                double price = scan.nextInt();
                mouseBuilder.setPrice(price);
                break;
            case 2:
                String color = scan.next();
                mouseBuilder.setColor(color);
                break;
            case 3:
                boolean wasUsed = scan.nextBoolean();
                mouseBuilder.setWasUsed(wasUsed);
                break;
            case 4:
                String brand = scan.next();
                mouseBuilder.setBrand(brand);
                break;
            case 5:
                Mouse mouse = mouseBuilder.build();
                DatabaseSave.save(mouse);
                mouse.print();
                return;
            case 6:
                return;
        }
        mouseCreator(mouseBuilder);
    }
    public static void monitorCreator(MonitorBuilder monitorBuilder){
        System.out.println("1. Price.\n2. Color.\n3.Was used.\n4. Brand\n5. Create object\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                double price = scan.nextInt();
                monitorBuilder.setPrice(price);
                break;
            case 2:
                String color = scan.next();
                monitorBuilder.setColor(color);
                break;
            case 3:
                boolean wasUsed = scan.nextBoolean();
                monitorBuilder.setWasUsed(wasUsed);
                break;
            case 4:
                String brand = scan.next();
                monitorBuilder.setBrand(brand);
                break;
            case 5:
                Monitor monitor = monitorBuilder.build();
                DatabaseSave.save(monitor);
                monitor.print();
                return;
            case 6:
                return;
        }
        monitorCreator(monitorBuilder);
    }
    static void createObject(){
        System.out.println("1. Laptop.\n2. Monoblock.\n3.Keyboard.\n4.Monitor.\n5.Mouse.\n6. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                laptopCreator(new LaptopBuilder());
                break;
            case 2:
                monoblockCreator(new MonoblockBuilder());
                break;
            case 3:
                keyboardCreator(new KeyboardBuilder());
                break;
            case 4:
                monitorCreator(new MonitorBuilder());
                break;
            case 5:
                mouseCreator(new MouseBuilder());
                break;
            case 6:
                return;
        }
    }
}