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
    private int deliveryCount;

    public Driver(int driverId) {
        this.driverId = driverId;
        this.deliveryCount = 0;
    }

    /**
     * Getter method to get driver ID.
     */
    public int getDriverId() {
        return driverId;
    }

    public int getDeliveryCount() {
        return deliveryCount;
    }

    /**
     * Method for driver to be updated / notified on delivery request.
     * 
     * @see edu.bu.met.cs665.deliveryobserver.DeliveryObserver#update()
     */
    @Override
    public void update(DeliveryRequest request) {
        deliveryCount++;
        System.out.println(
                "Driver "
                        + this.driverId
                        + " has received delivery request "
                        + request.getRequestId()
                        + " for address: "
                        + request.getAddress());
    }
}
