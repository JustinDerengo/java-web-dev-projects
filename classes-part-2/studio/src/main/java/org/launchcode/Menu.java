package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public Menu() {
        this.lastUpdated = LocalDate.now();
        MenuItem item1 = new MenuItem(12.50, "Burger", "Lunch", false);
        MenuItem item2 = new MenuItem(16.50, "Steak and fries", "Dinner", false);
        MenuItem item3 = new MenuItem(9.00, "Peach Cobbler", "Dessert", true);

        this.items = new ArrayList<>(Arrays.asList(item1, item2, item3));
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem (double price, String description, String category) {
        try {
            MenuItem menuItem = new MenuItem(price, description, category, true);
            if (price == 0 || description == null || category == null) {
                throw new Exception ("One or more of the fields is missing.");
            }
            for (MenuItem value : this.items) {
                if (value.getDescription().equalsIgnoreCase(description)) {
                    throw new Exception("This item already exists in the menu");
                }
            }
            for (MenuItem item : this.items) {
                item.setNew(false);
            }
            this.items.add(menuItem);
            setLastUpdated(LocalDate.now());

        } catch (Exception e) {
            System.out.println("FAILURE! : " + e.getMessage());
        }
    }

    public void removeItem (MenuItem menuItem, String description) {
        try {
            if (menuItem.getDescription().equalsIgnoreCase(description)) {
                this.items.remove(menuItem);
                setLastUpdated(LocalDate.now());
            } else {
                throw new Exception("No such item on the menu.");
            }
        } catch (Exception e) {
            System.out.println("FAILURE! : " + e.getMessage());
        }
    }

    public void listItems() {
        System.out.println("\nMenu Last Updated: " + this.lastUpdated);
        for (MenuItem item : this.items) {
            if (item.getNew()) {
                System.out.println("\n*NEW*");
            }
            System.out.println("\n" + item.getDescription());
            System.out.println(item.getPrice());
        }
    }

    public void printItem(MenuItem menuItem, String description) {
        try {
            if (menuItem.getDescription().equalsIgnoreCase(description)) {
                if (menuItem.getNew()) {
                    System.out.println("\n*NEW*");
                }
                System.out.println("\n" + menuItem.getDescription());
                System.out.println(menuItem.getCategory());
                System.out.println(menuItem.getPrice());
            } else {
                throw new Exception("No such item exists.");
            }
        } catch (Exception e) {
            System.out.println("FAILURE: " + e.getMessage());
        }
    }
}


