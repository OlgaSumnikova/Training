package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        long time = Time.addTimeList(list);
        long search = Time.searchTimeList(list);
        long removal = Time.removeTimeList(list);
        long sum = Time.total(time, search, removal);
        System.out.println("add to ArrayList " + time);
        System.out.println("Search in ArrayList " + search);
        System.out.println("Removal from ArrayList " + removal);
        System.out.println("Total time spent for ArrayList " + sum);

        LinkedList linked = new LinkedList();
        long time2 = Time.addTimeLinked(linked);
        long search2 = Time.searchTimeLinked(linked);
        long removal2 = Time.removeTimeLinked(linked);
        long sum2 = Time.total2(time2, search2, removal2);
        System.out.println("add to LinkedList " + time2);
        System.out.println("Search in LinkedList " + search2);
        System.out.println("Removal from LinkedList " + removal2);
        System.out.println("Total time spend for LinkedList " + sum2);


        HashSet hash = new HashSet();
        long time3 = Time.addTimeHash(hash);
        long search3 = Time.searchTimeHash(hash);
        long removal3 = Time.removeTimeHash(hash);
        long sum3 = Time.total3(time3, search3, removal3);
        System.out.println("add to HashSet " + time3);
        System.out.println("Search in HashSet " + search3);
        System.out.println("Removal from HasSet " + removal3);
        System.out.println("Total time spend for HashSet " + sum3);


        TreeSet tree = new TreeSet();
        long time4 = Time.TimeTree(tree);
        long search4 = Time.searchTimeTree(tree);
        long removal4 = Time.removeTimeTree(tree);
        long sum4 = Time.total4(time4, search4, removal4);
        System.out.println("add to TreeSet " + time4);
        System.out.println("Search in TreeSet " + search4);
        System.out.println("Removal from TreeSet " + removal4);
        System.out.println("Total time spend for TreeSet " + sum4);

        if (sum < sum2) {
            if (sum < sum3) {
                if (sum < sum4) {
                    System.out.println("ArrayList is the fastest");
                } else {
                    if (sum2 < sum3) {
                        if (sum2 < sum4) {
                            System.out.println("LinkedList is the fastest");
                        } else {
                            if (sum3 < sum4) {
                                System.out.println("HashSet is the fastest");
                            } else {
                                System.out.println("TreeSet is the fastest");
                            }
                        }
                    }
                }
            }
        }

    }

}