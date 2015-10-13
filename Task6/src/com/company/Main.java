package com.company;


import java.util.Arrays;
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

                int[] flat = new int[6];

                int a =3;


                for (int i = 0; i < 6; i++) {
                    flat[i] = mas[a][i];
                }


                Arrays.sort(flat);

                int ctr = 0;
                for (int row = 0; row < 1; row++) {
                    for (int col = 0; col < 6; col++) {
                        mas[row][col] = flat[ctr++];
                    }
                }

                for (int row = 0; row < 1; row++) {
                    for (int col = 0; col < 6; col++) {
                        System.out.print(mas[row][col] + " ");
                    }
                    System.out.println();
                }

            }
            }


