package com.company;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");
        cat1.run(201);
        cat1.run(159);
        cat1.swim(10);
        dog1.run(400);
        dog1.run(501);
        dog1.swim(100);
        dog1.swim(5);
        System.out.println(Animal.animalCount);
        System.out.println(Dog.dogCount);
        System.out.println(Cat.catCount);
    }
}

    abstract class Animal{
        String name;
        static int animalCount = 0;
        {
            animalCount ++;
        }

        public Animal(){}

        public Animal(String name) {
            this.name = name;
        }


        public void run(int distance){
            System.out.println(name + " пробежал(а) " + distance + " метров");
        }

        public abstract void swim(int distance);
    }
    class Cat extends Animal {

        static int catCount = 0;
        {
            catCount ++;
        }

        public Cat(String name){
            this.name = name;
        }

        @Override
        public void swim(int distance) {
            System.out.println("Кот " + this.name + " не умеет плавать");
        }

        @Override
        public void run(int distance) {
            if (distance <= 200){
                super.run(distance);
            } else {
                System.out.println(this.name + " ленится столько бежать");
            }
        }
    }
    class Dog extends Animal {

        static int dogCount = 0;
        {
            dogCount ++;
        }

        public Dog(String name){
            this.name = name;
        }

        @Override
        public void run(int distance) {
            if (distance <= 500){
                super.run(distance);
            } else {
                System.out.println(this.name + " ленится столько бежать");
            }
        }

        @Override
        public void swim(int distance) {
            System.out.println(distance <= 10 ? "Собака по кличке " + this.name + " проплыл(а) " + distance + " метров" : this.name + " ленится столько плыть");
        }
    }

