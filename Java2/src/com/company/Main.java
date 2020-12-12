package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Занятие 2");
        System.out.println("Задание 1");
        int[] arg = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        reverse(arg);
        System.out.println("Задание 2");
        fillMass();
        System.out.println("Задание 3");
        multIfLessSix(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("Задание 4");
        squareMass(5);
        System.out.println("Задание 5");
        massMinMax(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("Задание 6");
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[] {2, 2}));
        System.out.println(checkBalance(new int[] {2, 10}));

    }

    public static void reverse(int[] args) {
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            if  (args[i] == 0){
                args[i] = 1;
            } else {
                args[i] = 0;
            }
        }
        System.out.println(Arrays.toString(args));
    }
    public static void fillMass() {
        int[] args = new int[8];
        for (int i = 0; i < args.length; i++) {
            args[i] = 3 * i;
        }
        System.out.println(Arrays.toString(args));
    }
    public static void multIfLessSix(int[] args){
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++){
            if (args[i] < 6){
                args[i] = args[i] * 2;
            }
        }
        System.out.println(Arrays.toString(args));
    }
    public static void squareMass(int n){
        int[][] square = new int[n][n];
        String res = "";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j)
                {
                    square[i][j] = 1;
                } else {
                    square[i][j] = 0;
                }
                res += square[i][j] + " ";
            }
            res += "\n";
        }
        System.out.println(res);
    }
    public static void  massMinMax(int[] args){
        int min = 2147483647;
        int max = -2147483648;
        for (int i = 0; i < args.length; i++){
            min = Math.min(min, args[i]);
            max = Math.max(max, args[i]);
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static boolean checkBalance(int[] arr){
        int balanceCheckerK;
        int balanceCheckerJ;
        for (int i = 0; i < arr.length; i++){
            balanceCheckerK = 0;
            balanceCheckerJ = 0;
            for (int k = 0; k < i; k++){
                balanceCheckerK += arr[k];
            }
            for (int j = i; j < arr.length; j++){
                balanceCheckerJ += arr[j];
            }
            if (balanceCheckerJ == balanceCheckerK){
                return true;
            }
        }
        return false;
    }

}
