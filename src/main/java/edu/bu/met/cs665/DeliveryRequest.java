/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2026
 * File Name: Driver.java
 * Description: Concrete class for Delivery Request containing request metadata.
 */

package edu.bu.met.cs665;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import edu.bu.met.cs665.deliveryobserver.Driver;

public class DeliveryRequest {
    Random random = new Random();

    private int requestId;
    private String address;
    public Set<Driver> drivers = new HashSet<>();

    /**
     * Constructor for DeliveryRequest instance. Generates random request ID.
     * @param address Address for delivery request.
     */
    public DeliveryRequest(String address) {
        int randomId = random.nextInt(9999);
        this.requestId = randomId;
        this.address = address;
        System.out.println("Created delivery request #" + this.requestId + " to '" + this.address + ".");
    }

    /**
     * Getter for request ID.
     * @return Request ID.
     */
    public int getRequestId() {
        return requestId;
    }

    /**
     * Getter for delivery address.
     * @return Delivery address.
     */
    public String getAddress() {
        return address;
    }
}
