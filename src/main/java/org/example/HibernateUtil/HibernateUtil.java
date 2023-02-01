package org.example.HibernateUtil;
import java.util.Properties;

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
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/test");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(GamingLaptop.class);
                configuration.addAnnotatedClass(HomeLaptop.class);
                configuration.addAnnotatedClass(WorkLaptop.class);

                configuration.addAnnotatedClass(Monoblock.class);
                configuration.addAnnotatedClass(Keyboard.class);
                configuration.addAnnotatedClass(Monitor.class);
                configuration.addAnnotatedClass(Mouse.class);

                configuration.addAnnotatedClass(Charger.class);
                configuration.addAnnotatedClass(Headphone.class);
                configuration.addAnnotatedClass(PhoneCase.class);

                configuration.addAnnotatedClass(ElectronicBook.class);
                configuration.addAnnotatedClass(FitnessBracelet.class);
                configuration.addAnnotatedClass(SmartWatch.class);

                configuration.addAnnotatedClass(Huawei.class);
                configuration.addAnnotatedClass(Oppo.class);
                configuration.addAnnotatedClass(Samsung.class);
                configuration.addAnnotatedClass(Xiaomi.class);

                configuration.addAnnotatedClass(Apple.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}