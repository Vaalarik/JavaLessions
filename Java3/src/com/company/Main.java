

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру Угадай число");
        int randBound = 10;
        int attempts = 3;
        Random rand = new Random();
        int compNumber = rand.nextInt(randBound);
        System.out.println("Попробуйте угадать число от 0 до " + (randBound - 1));
        for(int i = 0; i < attempts; ++i) {
            int userNumber = scan.nextInt();
            System.out.println("Попыток осталось: " + (attempts - i - 1));
            if (userNumber == compNumber) {
                System.out.println("Вы угадали число, поздравляем");
                System.out.println("Не хотите ли сыграть еще раз? 1 - да / 0 - нет");
                if (scan.nextInt() == 1) {
                    guessNumber();
                } else {
                    return;
                }
            } else {
                if (userNumber > compNumber) {
                    System.out.println("Загаданное число меньше");
                }
                if (userNumber < compNumber) {
                    System.out.println("Загаданное число больше");
                }
            }
        }
        scan.close();
    }

    public static void guessWord() {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int compWordIndex = rand.nextInt(26);
        String compWord = words[compWordIndex];
        String userWord = "";
        while(!userWord.equals(compWord)) {
            userWord = scan.nextLine();
            String outputWord = "";
            for(int i = 0; i < 15; ++i) {
                if (i < Math.min(compWord.length(), userWord.length())) {
                    char a = userWord.charAt(i);
                    char b = compWord.charAt(i);
                    if (a == b) {
                        outputWord = outputWord + a;
                    } else {
                        outputWord = outputWord + "#";
                    }
                }
            }
            while(outputWord.length() < 15) {
                outputWord = outputWord + "#";
            }
            if (userWord.equals(compWord)) {
                System.out.println("Вы угадали");
                return;
            }
            System.out.println("Вы не угадали. Попробуйте еще");
            System.out.println(outputWord);
        }
        scan.close();
    }
}
