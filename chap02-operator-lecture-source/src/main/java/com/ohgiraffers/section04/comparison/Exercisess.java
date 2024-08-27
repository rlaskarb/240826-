package com.ohgiraffers.section04.comparison;

public class Exercisess {
    public static void main(String[] args) {

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        System.out.println(b = (byte)i);
        System.out.println(ch = (char)b);
//        System.out.println(short s = (short)ch);
//        System.out.println(float f = (float)l);
        System.out.println( i = (int)ch);




    }
}
