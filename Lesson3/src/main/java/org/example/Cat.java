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
        System.out.println("���: " + name + " ����: " + color);
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println(name + " ����� ������ � �����");
        } else {
            System.out.println("��� " + name + " ��������� " + length + " ������");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("��� �� ����� �������");
    }
}
