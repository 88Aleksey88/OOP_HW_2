package org.example;


public class Main {
    public static void main(String[] args) {
        Greeting.greeting();
        Cat cat = new Cat();
        Owner owner = new Owner();
        cat.setName();
        cat.setAge();
        owner.setName();
        cat.setOwner(owner);
        owner.petOwnerGreeting();
        cat.voice();
        owner.bye();
    }
}