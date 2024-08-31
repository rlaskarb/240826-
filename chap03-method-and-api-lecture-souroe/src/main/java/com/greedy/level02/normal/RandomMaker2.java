package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker2 {

    public int randomNumber(int min , int max ){

        Random random = new Random();

        int result = random.nextInt(max - min) + min;

        return result;

    }
}
