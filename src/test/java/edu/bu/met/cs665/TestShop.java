package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.deliveryobserver.Driver;

public class TestShop {

    private Shop mockShop;
    // private DeliveryRequest mockDeliveryRequest;
    private Set<Driver> drivers;

    @Before
    public void setUp() {
        mockShop = new Shop("Laya Dummy Store");
        drivers = new HashSet<>();

        for (int i = 1; i < 6 ; i++) {
            drivers.add(new Driver(i));
        }
    }

    @Test
    public void testCreateDeliveryRequest() {
        DeliveryRequest mockDeliveryRequest = mockShop.createDeliveryRequest("1 Laya Way");
        assertEquals("1 Laya Way", mockDeliveryRequest.getAddress());
        assertNotNull(mockDeliveryRequest.getRequestId());
    }

    @Test
    public void testAddDriversToDeliveryRequest() {

        for (Driver driver: drivers) {
            mockShop.addDeliveryObserver(driver);
        }

        assertEquals(5, mockShop.getObserverCount());
    }

    @Test 
    public void testNotifyDeliveryDrivers() {
        DeliveryRequest mockDeliveryRequest = mockShop.createDeliveryRequest("10 Laya Street");

        for (Driver driver: drivers) {
            mockShop.addDeliveryObserver(driver);
        }

        mockShop.notifyDeliveryObservers(mockDeliveryRequest);

        for (Driver driver: drivers) {
            assertEquals(1, driver.getDeliveryCount());
        }
    }

    @Test
    public void testRemoveDriver() {
        DeliveryRequest mockDeliveryRequest = mockShop.createDeliveryRequest("23 Laya Place");

        Driver driverToRemove = new Driver(67);
        Driver driverToKeep = new Driver(76);

        mockShop.addDeliveryObserver(driverToRemove);
        mockShop.addDeliveryObserver(driverToKeep);

        assertEquals(2, mockShop.getObserverCount());

        mockShop.removeDeliveryObserver(driverToRemove);
        assertEquals(1, mockShop.getObserverCount());

        mockShop.notifyDeliveryObservers(mockDeliveryRequest);
        assertEquals(0, driverToRemove.getDeliveryCount());
        assertEquals(1, driverToKeep.getDeliveryCount());
    }

}
