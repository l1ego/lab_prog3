package org.GROUPNAME.io;

import org.GROUPNAME.model.Item;
import org.GROUPNAME.model.Person;

public class PrettyPrinter {
    static void printPeople(Person[] people){
        for (int i = 0; i < people.length && people[i] != null ; i++) {
            printSpace();
            printPeople(people[i]);

            printSpace();
        }
    }

    private static void printPeople(Person people) {
        System.out.println("Name: " + people.name);
        System.out.println("Age : " + people.age);
        System.out.println("Owned Value : " + people.totalValue());
    }

    private static void printSpace() {
        for (int j = 0; j < 80; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Item car = new Item("car", 100);
        Item phone = new Item("phone", 10);

        Item[] myItem = new Item[100];
        Person leo = new Person("leo", 22, myItem);

        Item[] mumItem = new Item[100];
        Person mum = new Person("rita", 57, mumItem);

        leo.addItem(car);
        leo.addItem(phone);
        leo.removeItem(phone);

        mum.addItem(car);
        mum.addItem(phone);
        mum.removeItem(car);

        Person[] people = new Person[5];
        people[0] = leo;
        people[1] = mum;

        printPeople(people);
    }
}
