/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2026
 * File Name: Driver.java
 * Description: Concrete class for Driver as an observer for shop.
 */

package edu.bu.met.cs665.deliveryobserver;

import edu.bu.met.cs665.DeliveryRequest;

public class Driver extends DeliveryObserver {
    private int driverId;

    public Driver(int driverId) {
        this.driverId = driverId;
    }

    public int getDriverId() {
        return driverId;
    }

    /**
     * Method for driver to be updated / notified on delivery request.
     * @see edu.bu.met.cs665.deliveryobserver.DeliveryObserver#update()
     */
    @Override
    public void update(DeliveryRequest request) {
        System.out.println("Driver " + this.driverId + " has received delivery request!");
    }
}
