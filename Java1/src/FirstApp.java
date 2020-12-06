public class FirstApp {
    public static void main(String[] args) {
       byte myByte = 127;
       short myShort = 32767;
       int myInt = 2147483647;
       long myLong = 9223372036854775807L;
       float myFloat = 22.4f;
       double myDouble = 11.2d;
       char myChar = 'A';
       boolean myBool = true;
       String myString = "Somebody once told me";
       System.out.println("Задание 3");
       System.out.println(simpleCalc(1,1,1,1));
       System.out.println("Задание 4");
       inRange(10, 10);
       System.out.println("Задание 5");
       isPositive(-10);
       isPositive(0);
       isPositive(10);
       System.out.println("Задание 6");
       isNegative(-10);
       isNegative(0);
       isNegative(10);
       System.out.println("Задание 8");
       sayHi("Мемыч");
       System.out.println("Задание 9");
       isLeap(2020);
       isLeap(1900);
    }
    public static float simpleCalc(int a,int b,int c,int d){
        float result;
        result = a * (b + (c / d));
        return result;
    }
    public static void inRange(int a, int b){
        boolean isInRange = ((a + b) >= 10 && (a + b) <= 20);
        System.out.println(isInRange ? "Входит в диапазон" : "Не входит в диапазон");
        if ((a + b) >= 10 && (a + b) <= 20){
            System.out.println("Входит в диапазон");
        } else {
            System.out.println("Не входит в диапазон");
        }
    }
    public static void isPositive(int a){
        boolean isIntPos = (a >= 0);
        System.out.println(isIntPos ? "Число "+a+" положительное" : "Число "+a+" отрицательное");
    }
    public static void isNegative(int a){
        boolean isIntNeg = (a < 0);
        System.out.println(isIntNeg);
    }
    public static void sayHi(String name){
        System.out.println("Привет, "+name+"!");
    }
    public static void isLeap(int year){
        if ((year % 4 == 0) & (!(year % 100 == 0))){
            System.out.println(year+ " год является високосным");
        } else {
            if (year % 400 == 0){
                System.out.println(year+ " год является високосным");
            } else {
                System.out.println(year+ " год не является високосным");
            }

        }

    }
}
