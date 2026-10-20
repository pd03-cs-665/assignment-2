/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2026
 * File Name: Shop.java
 * Description: Concrete class for Shop as an observable for DeliveryObserver.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.deliveryobserver.DeliveryObserver;
import java.util.HashSet;
import java.util.Set;


public class Shop {
    private String name;
    private Set<DeliveryObserver> observers = new HashSet<>();

    /**
     * Constructor for Shop instance.
     * 
     * @param name Shop name.
     */
    public Shop(String name) {
        this.name = name;
    }

    /**
     * Getter method for shop name.
     * 
     * @return Shop name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of currently subscribed DeliveryObservers.
     * @return Number of current DeliveryObservers.
     */
    public int getObserverCount() {
        int observerCount = observers.size();
        return observerCount;
    }

    /**
     * Subscribe a delivery observer to get notified on delivery requests.
     * 
     * @param observer Object of type DeliveryObserver to add.
     */
    public void addDeliveryObserver(DeliveryObserver observer) {
        if (observers.add(observer)) {
            System.out.println("Added DeliveryObserver!");
        }
        ;
    }

    /**
     * Unsubscribe a delivery observer from delivery requests.
     * 
     * @param observer Driver object to remove.
     */
    public void removeDeliveryObserver(DeliveryObserver observer) {
        if (observers.remove(observer)) {
            System.out.println("Removed DeliveryObserver");
        }
    }

    /**
     * Notify all subscribed DeliveryObserver objects.
     */
    public void notifyDeliveryObservers(DeliveryRequest request) {
        for (DeliveryObserver observer : observers) {
            observer.update(request);
        }
    }

    /**
     * Creates and notifies drivers of a new delivery request.
     * 
     * @param address Address to create DeliveryRequest to.
     * @return Created DeliveryRequest object.
     */
    public DeliveryRequest createDeliveryRequest(String address) {
        DeliveryRequest request = new DeliveryRequest(address);

        System.out.println("Created delivery request for '" + this.name + "' shop.");

        notifyDeliveryObservers(request);
        return request;
    }
}
