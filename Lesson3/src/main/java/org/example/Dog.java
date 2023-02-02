package org.example;

public class Dog extends Animal {

    int tailLength;
    public Dog(String name, int tailLength)
    {
        this.name = name;
        this.tailLength = tailLength;
        countDog++;
    }
    @Override
    public void info() {
        System.out.println("Собака: " + name + " длина хвоста: " + tailLength);

    }
    public void Bark() {
        System.out.println("Собака лает, но не кусает");
    }
    private static int countDog;

    public static int getCountDog()
    {
        return countDog;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println(name + " устал бежать и уснул");
        } else {
            System.out.println("Собака " + name + " пробежала " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println(name + "устал плыть и вылез из воды");
        } else {
            System.out.println("Собака " + name + " проплыла " + length + " метров");
        }
    }
}
