package com.ohgiraffers.section3.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {

        /* 수업 목표  java.util.Random 클래스를 사용해서 난수 발생 */

        Random random = new Random();

        /*필기
        * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber : " + randomNumber);

        //1~10
        int randomNumber2 = random.nextInt(11) + 1;
        System.out.println("randomNumber2 :" + randomNumber2);

        //10~15
        int randomNumber3 = random.nextInt(6) + 10;
        System.out.println("randomNumber3 : " + randomNumber3);

        //-127 ~ 128
        int randomNumber4 = random.nextInt(256) + -128;
        System.out.println("randomNumber4 : " + randomNumber4);


    }
}








