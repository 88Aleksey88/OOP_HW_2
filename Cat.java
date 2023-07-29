package org.example;

import java.util.Scanner;

public class Cat implements Pet{
    private String name;
    private Integer age;
    private Owner owner;

//    public String getName() {
//        return name;
//    }
//    public Integer getAge() {
//        return age;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

//    public void greet(){
//        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет)." + " Мой владелец - " + owner);
//    }

    @Override
    public void setName() {
        System.out.println("Введите кличку животного: ");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    @Override
    public void setAge() {
        System.out.println("Введите возраст животного: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.valueOf(scanner.nextLine());
        if (number < AGEMIN){
            System.out.println("Возраст не может быть отрицатльным");
            this.age = 0;
        }
        else this.age = number;
    }
    @Override
    public void voice() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет)." + " Мой владелец - " + owner);
    }
}
