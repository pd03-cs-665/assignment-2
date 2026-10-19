package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.deliveryobserver.Driver;

public class TestShop {

    private Shop mockShop;
    private DeliveryRequest mockDeliveryRequest;
    private Set<Driver> drivers;

    @Before
    public void setUp() {
        mockShop = new Shop("test");
        drivers = new HashSet<>();

        mockDeliveryRequest = mockShop.createDeliveryRequest("1 Laya Way");

        for (int i = 0; i < 5 ; i++) {
            drivers.add(new Driver(i));
        }
    }

    @Test
    public void testAddDriversToDeliveryRequest() {
        for (Driver driver: drivers) {
            mockShop.addDriver(driver);
        }
        // TODO add assertions
    }

    @Test 
    public void testNotifyDeliveryDrivers() {
        for (Driver driver: drivers) {
            mockShop.addDriver(driver);
        }

        mockShop.notifyDrivers(mockDeliveryRequest);

        // TODO add assertions
    }

}
