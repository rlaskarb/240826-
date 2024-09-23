package com.ohgiraffers.section02.extend;

public class Bunny extends Rabbit {
    /* 바니도 토끼의 일종이다.*/

    @Override
    public void cry() {
        System.out.println("어린 토끼가 샤우팅을 합니다.");
    }
}
