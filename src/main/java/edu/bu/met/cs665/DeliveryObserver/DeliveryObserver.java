/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2026
 * File Name: Driver.java
 * Description: Abstract class for delivery observers for shop.
 */

package edu.bu.met.cs665.deliveryobserver;

import edu.bu.met.cs665.DeliveryRequest;

public abstract interface DeliveryObserver {
    /**
     * Abstract method triggered by the subject to receive updated information.
     * 
     * @param request DeliveryRequest to process.
     */
    public abstract void update(DeliveryRequest request);
}
