package org.example;


public class Main {

    public static void main(String[] args)
    {
        Cat Barsik = new Cat("������", "�����");
        Barsik.info();
        Barsik.swim(15);
        Cat Murzik = new Cat("������", "�����");
        Murzik.run(150);
        System.out.println("����� �����: " + Cat.getCountCat());
        Dog Sharik = new Dog("�����", 10);
        Sharik.info();
        Sharik.run(501);
        Sharik.swim(9);
        System.out.println("����� �����: " + Dog.getCountDog());
        System.out.println("�������� �����: " + Animal.getCountAnimal());
    }


}