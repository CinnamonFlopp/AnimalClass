package org.example;

public class Animal
{
    String name;


    public Animal()
    {
        countAnimal++;
    }

    public Animal(String name)
    {
        countAnimal++;
        this.name = name;
    }

    private static int countAnimal;

    public static int getCountAnimal()
    {
        return countAnimal;
    }

    public void info() {
        System.out.println("��������: " + name);
    }

    public void run(int length)
    {
        System.out.println("�������� " + name + " ��������� " + length + " ������");
    }
    public void swim(int length)
    {
        System.out.println("�������� " + name + " �������� " + length + " ������");
    }
}

