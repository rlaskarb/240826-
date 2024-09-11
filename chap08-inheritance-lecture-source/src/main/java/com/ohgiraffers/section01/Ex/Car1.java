package com.ohgiraffers.section01.Ex;

import com.ohgiraffers.section01.extend.Car;

public class Car1 {

    /*멤버 > 필드 , 메소드 */
    private boolean runningStatus; // 달리고 있는지를 확인하기위함

    public Car1(){
        System.out.println("Car1 시작");}
        /*run()-> 달리는 기능, soundHorn(): 경적을 울리는 기능
        * isRunning(): 주행 상태를 반환하는 기능
        * stop() : 멈추는기능
        * */
    public void run(){
        runningStatus = true;
        System.out.println("자동차 출발");
    }

    //
    protected boolean isRunning(){
        // 주행 상태를 반환할때 사용이 가능하다
        return runningStatus;
    }



    public void soundHorn(){
        // 단. 주행중에만 경적을 눌를수 있다.
        if(isRunning()){

    }
}
