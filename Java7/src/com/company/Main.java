package com.company;

    class Cat{
        private String name;
        private int appetite;
        private boolean satiety;
        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
        }
        public void info(){
            System.out.println("Имя кота: " + this.name);
            System.out.println("Аппетит кота: " + this.appetite);
            System.out.println(satiety ? "Кот сыт" : "Кот голоден");
        }
        public void eat(Plate plate){
            if (plate.getFood() - this.appetite >= 0) {
                System.out.println("Кот поел " + appetite);
                plate.decreaseFood(appetite);
                this.satiety = true;
            } else {
                System.out.println("Здесь слишком мало еды. Кот недоволен");
            }
        }
    }

    class Plate {
        private int food;
        public Plate(int food) {
            this.food = food;
        }
        public void setFood(int food){
            this.food = food;
        }
        public int getFood(){
            return this.food;
        }
        public void fillPlate(int food){
            System.out.println("Вы наполнили тарелку на " + food);
            this.food += food;
        }
        public void decreaseFood(int food){
            this.food -= food;
        }
        public void info() {
            System.out.println("plate: " + food);
        }
    }

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Oleo", 20);
        catArray[1] = new Cat("Olea", 25);
        catArray[2] = new Cat("Olee", 30);
        catArray[3] = new Cat("Oloo", 15);
        catArray[4] = new Cat("Oleq", 10);
        Plate plate = new Plate(100);
        for (int i = 0; i < catArray.length; i++){
            catArray[i].info();
            catArray[i].eat(plate);
            plate.info();
            System.out.println("");
        }
    }



}
