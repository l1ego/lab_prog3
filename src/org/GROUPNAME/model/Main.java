package org.GROUPNAME.model;

public class Main {
    public static void main(String[] args) {
        Item car = new Item("car", 100);
        Item phone = new Item("phone", 10);
        Item[] ownedItems = new Item[100];
        Person leo = new Person("Leo", 22, ownedItems );

        leo.addItem(car);
        leo.addItem(phone);
        System.out.println(leo.totalValue());
    }

}
