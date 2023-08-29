package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Menu menu = new Menu();
        menu.listItems();

        menu.addItem(15.00, "Chocolate Mousse", "Dessert");
        menu.printItem(menu.getItems().get(3), "Chocolate mousse");

        menu.removeItem(menu.getItems().get(2), "Peach cobbler");
        menu.listItems();
    }
}
