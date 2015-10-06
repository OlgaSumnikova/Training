package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        int count = 0;


        for (int i = 999999; i > 999; i--) {
            n = i;


            String numberAsString = Integer.toString(n);
            int numberLength = numberAsString.length();



            if (numberLength > 5) {
                char[] stringAsCharArray = numberAsString.toCharArray();
                int firstThreeNumbersSum = (int) stringAsCharArray[0] + (int) stringAsCharArray[1] + (int) stringAsCharArray[2];
                int secondThreeNumbersSum = (int) stringAsCharArray[3] + (int) stringAsCharArray[4] + (int) stringAsCharArray[5];
                if (firstThreeNumbersSum == secondThreeNumbersSum) {
                    count++;
                    System.out.println("Success" + n);
                }


            } else if (numberLength == 5) {
                numberAsString = "0" + numberAsString;
                char[] stringAsCharArray = numberAsString.toCharArray();
                int firstThreeNumbersSum = (int) stringAsCharArray[0] + (int) stringAsCharArray[1] + (int) stringAsCharArray[2];
                int secondThreeNumbersSum = (int) stringAsCharArray[3] + (int) stringAsCharArray[4] + (int) stringAsCharArray[5];
                if (firstThreeNumbersSum == secondThreeNumbersSum) {
                    count++;
                    System.out.println("Success" + numberAsString);
                }

            } else if (numberLength == 4) {
                numberAsString = "00" + numberAsString;
                char[] stringAsCharArray = numberAsString.toCharArray();

                int firstThreeNumbersSum = (int) stringAsCharArray[0] + (int) stringAsCharArray[1] + (int) stringAsCharArray[2];
                int secondThreeNumbersSum = (int) stringAsCharArray[3] + (int) stringAsCharArray[4] + (int) stringAsCharArray[5];
                if (firstThreeNumbersSum == secondThreeNumbersSum) {
                    count++;
                    System.out.println("Success" + numberAsString);
                }
            }
        }
        System.out.println("Total Count " +count);
    }
}