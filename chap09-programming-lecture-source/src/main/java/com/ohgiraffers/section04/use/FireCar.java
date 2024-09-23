package com.ohgiraffers.section04.use;
// 경적도 울릴 수 있고, 차에 기본적인 기능도 수행할 수 있다.
public class FireCar extends Car implements SoundHorn {

    @Override
    public void go() {
        System.out.println("소오바방차가 나아가갑니당!");
    }

    @Override
    public void stop() {
        System.out.println("소오바방차가 머엄춤니당!!");
    }

    @Override
    public void horn() {
        System.out.println(" 빠아앙 ");
    }
}
