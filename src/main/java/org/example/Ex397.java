package org.example;

abstract class Animal {
    String a = " is animal";
    abstract void look();

    void show() {
        System.out.println("Zoo");
    }
}

class Chicken extends Animal {
    public Chicken() {
        look();
    }

    @Override
    void look() {
        System.out.println("Chicken" + a); // Chicken is animal
    }

    void display(){
        System.out.println("two wings");
    }
}

public class Ex397 {
    public static void main(String[] args) {
        Animal a = new Chicken();
        a.show();
    }
}
