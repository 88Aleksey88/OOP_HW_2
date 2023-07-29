package org.example;

public interface Bye {
    default void bye(){
        System.out.println("Это был мой домашний питомец! До скорых встреч!");
    }
}
