package org.example.electronics.mobile.smartphones;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.mobile.Mobile;
@MappedSuperclass
abstract public class Smartphone extends Mobile {
    String cameraResolution;

    public Smartphone(double price, String color, boolean wasUsed, String size, String cameraResolution) {
        super(price, color, wasUsed,null, size);
        this.cameraResolution = cameraResolution;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public Smartphone() {
    }
}
