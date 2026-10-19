package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestShop {

    private Shop mockShop;
    private DeliveryRequest mockDeliveryRequest;
    private List<Driver> drivers;

    @Before
    public void setUp() {
        mockShop = new Shop("test");
        drivers = new ArrayList<>();

        mockDeliveryRequest = mockShop.createDeliveryRequest();

        for (int i = 0; i < 5 ; i++) {
            drivers.add(new Driver());
        }
    }

    @Test
    public void testAddDriversToDeliveryRequest() {
        for (Driver driver: drivers) {
            mockDeliveryRequest.addDriver(driver);
        }
        // TODO add assertions
    }

    @Test 
    public void testNotifyDeliveryDrivers() {
        for (Driver driver: drivers) {
            mockDeliveryRequest.addDriver(driver);
        }

        mockDeliveryRequest.notifyDrivers();

        // TODO add assertions
    }

}
