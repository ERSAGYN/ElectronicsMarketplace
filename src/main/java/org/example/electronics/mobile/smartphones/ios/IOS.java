package org.example.electronics.mobile.smartphones.ios;

import jakarta.persistence.MappedSuperclass;
import org.example.electronics.mobile.smartphones.Smartphone;
@MappedSuperclass
abstract public class IOS extends Smartphone {
    String versionIOS;

    public IOS(double price, String color, boolean wasUsed, String size, String cameraResolution, String versionIOS) {
        super(price, color, wasUsed, size, cameraResolution);
        this.versionIOS = versionIOS;
    }

    public void setVersionIOS(String versionIOS) {
        this.versionIOS = versionIOS;
    }

    public String getVersionIOS() {
        return versionIOS;
    }

    public IOS() {
    }
}
