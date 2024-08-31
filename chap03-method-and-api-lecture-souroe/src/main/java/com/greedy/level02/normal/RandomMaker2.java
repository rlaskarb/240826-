package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker2 {

    public int randomNumber(int min , int max ){

        Random random = new Random();

        int result = random.nextInt(max - min) + min;

        return result;

    }

    public String rockPaperScissors(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String result = (randomNumber == 0) ? "가위" : (randomNumber ==1) ? "바위" : "보";
        return result;


    }




}
