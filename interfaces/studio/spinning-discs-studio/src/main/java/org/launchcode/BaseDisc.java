package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;

    public BaseDisc(String name, int storageCapacity, int remainingCapacity, int capacityUsed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = remainingCapacity;
        this.capacityUsed = capacityUsed;
    }

    public String getName() {
        return name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setRemainingCapacity(int remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }

    public int getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(int capacityUsed) {
        this.capacityUsed = capacityUsed;
    }
}
