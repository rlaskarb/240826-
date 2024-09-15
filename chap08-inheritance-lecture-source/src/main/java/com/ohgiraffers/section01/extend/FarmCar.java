package com.ohgiraffers.section01.extend;

public class FarmCar extends Car {

    @Override
    public void run() {
        System.out.println("돌 굴러가유~");
    }

    @Override
    public void soundHorn() {
        System.out.println("어휴 급하면 어제오지 그랬슈");
    }
    

    @Override
    public void stop() {
        System.out.println("또 고장났네 이거 ");
    }

    public FarmCar(){
        System.out.println("??????????????????????");


    }
}
