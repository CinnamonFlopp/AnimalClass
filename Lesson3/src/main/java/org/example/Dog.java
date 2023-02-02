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
        System.out.println("������: " + name + " ����� ������: " + tailLength);

    }
    public void Bark() {
        System.out.println("������ ����, �� �� ������");
    }
    private static int countDog;

    public static int getCountDog()
    {
        return countDog;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println(name + " ����� ������ � �����");
        } else {
            System.out.println("������ " + name + " ��������� " + length + " ������");
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println(name + "����� ����� � ����� �� ����");
        } else {
            System.out.println("������ " + name + " �������� " + length + " ������");
        }
    }
}
