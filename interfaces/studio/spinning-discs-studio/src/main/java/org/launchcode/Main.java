package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD cd = new CD("Oingo Boingo", 700, 20, 680);
        DVD dvd = new DVD("Monty Python and the Holy Grail", 2000, 500, 1500);

        cd.destroyMicrowave();
        cd.readData();
        cd.spinDisc();

        dvd.destroyMicrowave();
        dvd.readData();
        dvd.spinDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}