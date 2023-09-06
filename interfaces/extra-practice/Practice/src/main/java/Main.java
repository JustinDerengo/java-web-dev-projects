package main.java;

public class Main {
    public static void main(String[] args) {
        ByTwos twos = new ByTwos();
        ByThrees threes = new ByThrees();

        System.out.println(twos.getNext(5));
        System.out.println(threes.getNext(5));
    }
}
