package main.java;

public class ByThrees implements Series{

    private int val;

    public ByThrees() {
        this.val = 0;
    }

    @Override
    public int getNext(int times) {

        for (int i = 0; i < times; i++) {
            this.val += 3;
        }
        return this.val;
    }

}
