package edu.bu.met.cs665;

// main class for subject + observer interactions
public class Shop {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public DeliveryRequest createDeliveryRequest() {
        DeliveryRequest request = new DeliveryRequest();

        // TODO: print shop metadata
        System.out.println("Created delivery request for " + this.name);

        request.notifyDrivers();

        return request;
    }
}
