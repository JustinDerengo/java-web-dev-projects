package main.java;

public class ByTwos implements Series {

    private int val;

    public ByTwos() {
        this.val = 0;
    }



    @Override
    public int getNext(int times) {
        for (int i = 0; i < times; i++) {
            this.val += 2;
        }
        return this.val;
    }


}
