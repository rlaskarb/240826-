package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker1 {
    public static void main(String[] args) {

        Random random = new Random();

        int first =10;
        int second =8;

        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber : " + randomNumber);

        int randomNumber2 = random.nextInt(20) ;
        System.out.println("randomNumber2 :" + randomNumber2);

    }


    public int minNumberof(int first, int second) {
        return (first < second) ? first : second;
    }

    public static int maxNumberof(int first, int second) {
        return (first > second) ? first : second;

    }

}