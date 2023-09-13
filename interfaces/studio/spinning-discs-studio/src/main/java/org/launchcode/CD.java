package org.launchcode;

public class CD  extends BaseDisc implements OpticalDisk{
    public CD(String name, int storageCapacity, int remainingCapacity, int capacityUsed) {
        super(name, storageCapacity, remainingCapacity, capacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disk spins between 200 - 500 RPM.");
    }

    @Override
    public void readData() {
        System.out.println("Classic sounds of the 90's.");
    }

    @Override
    public void destroyMicrowave() {
        System.out.println("This one has green sparkles.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
