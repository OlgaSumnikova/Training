package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(Days.MONDAY.getValue());
        list.add(Days.TUESDAY.getValue());
        list.add(Days.WEDNESDAY.getValue());
        list.add(Days.THURSDAY.getValue());
        list.add(Days.FRIDAY.getValue());
        list.add(Days.SATURDAY.getValue());
        list.add(Days.SUNDAY.getValue());


        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i) + " Before Sorting");

        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i) + "After Sorting");


        }

    }
}