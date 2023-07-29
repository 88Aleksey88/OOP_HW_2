package org.example;

import java.util.Scanner;

public class Owner implements Greeting, Bye{
    private String name;
    public String getName() {
        return name;
    }
    public void setName() {
        System.out.println("Введите имя влодельца: ");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void petOwnerGreeting() {
        System.out.println("Привет! Мой питомец сам может говорить!");
    }
}
