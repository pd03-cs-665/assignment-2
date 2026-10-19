/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2026
 * File Name: Shop.java
 * Description: Concrete class for Shop as an observable for DeliveryObserver.
 */

package edu.bu.met.cs665;

import java.util.HashSet;
import java.util.Set;

import edu.bu.met.cs665.deliveryobserver.Driver;

public class Shop {
    private String name;
    public Set<Driver> drivers = new HashSet<>();

    /**
     * Constructor for Shop instance.
     * @param name Shop name.
     */
    public Shop(String name) {
        this.name = name;
    }

    /**
     * Getter method for shop name.
     * @return Shop name.
     */
    public String getName() {
        return name;
    }

    /**
     * Subscribe a driver to get notified on delivery requests.
     * @param driver Driver object to add.
     */
    public void addDriver(Driver driver) {
        Boolean driverAdded = drivers.add(driver);
        if (driverAdded) {
            System.out.println("Driver " + driver.getDriverId() + " added");
        }
    }

    /**
     * Remove a driver to unsubscribe from delivery requests.
     * @param driver Driver object to remove.
     */
    public void removeDriver(Driver driver) {
        Boolean driverRemoved = drivers.remove(driver);
        if (driverRemoved) {
            System.out.println("Driver " + driver.getDriverId() + " removed");
        }
    }

    /**
     * Notify all subscribed Driver objects.
     */
    public void notifyDrivers(DeliveryRequest request) {
        for (Driver driver : drivers) {
            driver.update(request);
        }
    }

    /**
     * Creates and notifies drivers of a new delivery request.
     * @param address Address to create DeliveryRequest to.
     * @return Created DeliveryRequest object.
     */
    public DeliveryRequest createDeliveryRequest(String address) {
        DeliveryRequest request = new DeliveryRequest(address);

        System.out.println("Created delivery request for '" + this.name + "' shop.");

        notifyDrivers(request);
        return request;
    }
}
