package com.company;


import java.util.*;

public class Time {


    private static LinkedList linked;

    public static long addTimeList(List list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }


    public static long searchTimeList(List list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.contains(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    public static long removeTimeList(List list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            list.remove(i);
        }

        long end = System.currentTimeMillis() - start;
        return end;

    }

    public static long total(long time, long search, long removal) {
        long sum = time + search + removal;

        return sum;
    }


    public static long addTimeLinked(LinkedList linked) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linked.add(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;

    }

    public static long searchTimeLinked(LinkedList linked) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linked.contains(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }

    public static long removeTimeLinked(LinkedList linked) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linked.remove(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }


    public static long total2(long time2, long search2, long removal2) {
        long sum2 = time2 + search2 + removal2;

        return sum2;
    }


    public static long addTimeHash(HashSet hash) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hash.add(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }

    public static long searchTimeHash(HashSet hash) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hash.contains(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }

    public static long removeTimeHash(HashSet hash) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            hash.remove(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }


    public static long total3(long time3, long search3, long removal3) {
        long sum3 = time3 + search3 + removal3;

        return sum3;
    }


    public static long TimeTree(TreeSet tree) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            tree.add(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }


    public static long searchTimeTree(TreeSet tree) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            tree.contains(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }

    public static long removeTimeTree(TreeSet tree) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            tree.remove(i);
        }

        long end = System.currentTimeMillis() - start;

        return end;
    }

    public static long total4(long time4, long search4, long removal4) {
        long sum4 = time4 + search4 + removal4;

        return sum4;
    }



}