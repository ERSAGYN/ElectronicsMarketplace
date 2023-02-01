package org.example.electronics.mobile.smartphones.android;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.mobile.smartphones.Smartphone;
@MappedSuperclass
abstract public class Android extends Smartphone {
    String androidVersion;

    public Android(double price, String color, boolean wasUsed, String size, String cameraResolution, String androidVersion) {
        super(price, color, wasUsed, size, cameraResolution);
        this.androidVersion = androidVersion;
    }
}
