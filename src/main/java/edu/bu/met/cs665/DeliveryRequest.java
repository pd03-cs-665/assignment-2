package edu.bu.met.cs665;

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.List;
import java.util.Set;

// subject
public class DeliveryRequest {
    public Set<Driver> drivers = new HashSet<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }

    public void notifyDrivers() {
        for (Driver driver : drivers) {
            driver.update(this);
        }
    }
}
