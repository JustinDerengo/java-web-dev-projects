package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisk{
    public DVD(String name, int storageCapacity, int remainingCapacity, int capacityUsed) {
        super(name, storageCapacity, remainingCapacity, capacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disk spins between 570 - 1600 RPM.");
    }

    @Override
    public void readData() {
        System.out.println("Main menu. Now with boom operator commentary.");
    }

    @Override
    public void destroyMicrowave() {
        System.out.println("Ohhh it sparkles blue!");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
