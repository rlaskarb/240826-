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
    //public 접근제한자: 단어 뜻 그대로 외부클래스가 자유롭게 사용할 수 있도록 합니다.
    //protected 접근제한자 : 같은 패키지 또는 자식클래스에서 사용할수 있도록 합니다.
    //private 접근제한자 : 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수 없도록 합니다.
    //위 세가지 접근제한자가 적용되지 않으면 default 접근제한을 가집니다.
    //default 접근제한 : 같은 패키지에 소속된 클래스에 만 사용할수 있도록 합니다.

    protected boolean isRunning(){ //boolean 는
        // 주행 상태를 반환할때 사용이 가능하다
        return runningStatus;
    }


    public void soundHorn(){
        // 단. 주행중에만 경적을 눌를수 있다.
        if(isRunning()){
            System.out.println("turn on the b !!!");
        }else{
            System.out.println("그러면 안돼 정지중에 클락션 울리면 안돼");
        }
    }
    public void stop(){
        runningStatus = false;
        System.out.println("시동이 멈춤지시를 받았습니다. 시스템 종료중입니다. 잠시만 기달려주세요");
    }
}
