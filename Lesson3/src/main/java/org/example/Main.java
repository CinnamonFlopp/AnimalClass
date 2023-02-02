package org.example;


public class Main {

    public static void main(String[] args)
    {
        Cat Barsik = new Cat("Барсик", "Рыжий");
        Barsik.info();
        Barsik.swim(15);
        Cat Murzik = new Cat("Мурзик", "Серый");
        Murzik.run(150);
        System.out.println("Котов всего: " + Cat.getCountCat());
        Dog Sharik = new Dog("Шарик", 10);
        Sharik.info();
        Sharik.run(501);
        Sharik.swim(9);
        System.out.println("Собак всего: " + Dog.getCountDog());
        System.out.println("Животных всего: " + Animal.getCountAnimal());
    }


}