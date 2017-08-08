import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.MiddleClass;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {

    static void executePolymorphismDemo() {
        Cat cat = new Cat();
        Dog dog = new Dog();

        // полиморфизм
        Cat cat1 = cat;
        Dog dog1 = dog;

        //cat1 = dog; // так нельзя

        Animal animal = new Animal();
        animal.show();
        System.out.println();

        // полиморфизм
        animal = cat;
        animal.show(); // new Cat().show(); // ((Animal) new Cat()).show();
        System.out.println();
    }

    static void executeInstanceOfDemo0(Animal[] animals) {
        for(Animal arrayElement : animals) {
            arrayElement.show();
            System.out.println();
        }
    }

    static void executeInstanceOfDemo1(Animal[] animals) {
        // instanceof определяет к какому относиться объект
        for(Animal arrayElement : animals) {
            boolean isCat = arrayElement instanceof Cat;
            if (isCat) {
                System.out.println("Кот найден!");
            } else {
                System.out.println("Это не кот :(");
            }
        }
    }

    static void executeInstanceOfDemo2(Animal[] animals) {
        for (Animal animal : animals) {
            if (isItAnimal(animal)) System.out.println("Это и правда животное");
            if (isItCat(animal)) System.out.println("Это и правда кот");
            if (isItDog(animal)) System.out.println("Это и правда собака");
            System.out.println();
        }
    }

    static boolean isItCat(Animal animal) {
        return animal instanceof Cat;
    }

    static boolean isItDog(Animal animal) {
        return animal instanceof Dog;
    }

    static boolean isItAnimal(Animal animal) {
        return animal instanceof Animal;
    }

    public static void main(String[] args) {
        executePolymorphismDemo();

        Animal[] animals = new Animal[] {new Cat(), new Dog(), new Animal(), new Cat()};

        executeInstanceOfDemo0(animals);
        executeInstanceOfDemo1(animals);
        executeInstanceOfDemo2(animals);
    }
}
