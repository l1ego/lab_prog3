package org.GROUPNAME.model;


import java.util.Arrays;


public class Person {
    public String name;
    public int age;

    public Item[] ownedItems = new Item[100];

    public Person(String name, int age, Item[] ownedItems) {
        this.name = name;
        this.age = age;
        this.ownedItems = ownedItems;
    }

    public Person(String leo, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void addItem(Item I){
        for (int i = 0; i < 100; i++) {
            if (ownedItems[i] == null){
                ownedItems[i] = I;
                break;
            }
        }
    }
    public void removeItem(Item I){
        for (int i = 0; i < 100 && ownedItems[i] != null; i++) {
            if(ownedItems[i].equals(I))
                ownedItems[i] = null;
        }
    }

    public int totalValue(){
        int totV = 0;
        for (int i = 0; i < 100; i++) {
            if (ownedItems[i] != null){
                totV = totV + ownedItems[i].value;
            }
        }
        return totV;
    }

}
