package org.example;

public class Cat extends Animal {
    String color;

    private static int countCat;

    public static int getCountCat()
    {
        return countCat;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        countCat++;
    }

    @Override
    public void info() {
        System.out.println("Кот: " + name + " цвет: " + color);
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println(name + " устал бежать и уснул");
        } else {
            System.out.println("Кот " + name + " пробежало " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
