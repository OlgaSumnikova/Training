package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] mas = new int[6][7];


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mas[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.print(mas[i][j] + " ");

            }
            System.out.println();
        }

    }


}