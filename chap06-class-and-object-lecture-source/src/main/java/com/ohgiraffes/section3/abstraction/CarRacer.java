package com.ohgiraffes.section3.abstraction;

public class CarRacer {
    //클래스도 자료형이다.
    private Car car=new Car();

    public void startUp(){
        car.starUp();
    }

    public void starAccelator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }
}
