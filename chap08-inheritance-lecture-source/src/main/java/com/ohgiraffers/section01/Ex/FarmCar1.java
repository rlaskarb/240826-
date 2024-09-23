package com.ohgiraffers.section01.Ex;
// 상속 할때 자식은 부모꺼를 맘껏 가져다 쓸수가 있다. 가져가 쓸때 extends 를 사용한다.
public class FarmCar1 extends Car1{


    /*Override를 사용해서 Car1 에있는 메소드를  FarmCar1에 재사용한다.*/
    /*수퍼 를 지우고 원하는 문구로 타이핑해서 사용할수 있다.*/
    public FarmCar1() {
        System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!  ");
    }

    @Override
    public void run() {
        System.out.println("천천히 가유~");
    }

    @Override
    public void soundHorn() {
        System.out.println("소리가 없어서 못사용해유");
    }

    @Override
    public void stop() {
        System.out.println("고장났네이거 ㅋㅋㅋ");
    }
}
