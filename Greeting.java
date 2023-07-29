package org.example;

public interface Greeting {
    static void greeting(){
        System.out.println("Добрый день! Расскажите мне о своем питомце.");
    }
    void petOwnerGreeting();
}
