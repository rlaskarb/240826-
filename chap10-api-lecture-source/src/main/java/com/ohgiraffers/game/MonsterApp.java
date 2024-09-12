package com.ohgiraffers.game;

import java.util.Scanner;

public class MonsterApp {
    public static void main(String[] args) {
        Monster m = new Monster();
        m.Monster1();
        m.Monster2();
        m.Monster3();

        Scanner sc = new Scanner(System.in);

       String str1 = m.Monster1();
       String str2 = m.Monster2();
       String str3 = m.Monster3();

        System.out.println("str1 = " + str1);







    }
}
