package com.ohgiraffers.section01.extend;

public class Car {
    /* 멤버 -> 필드, 메소드 */
    private boolean runningStatus; //달리고 있는지 여부

    public Car(){
        System.out.println("Car 클래스의 기본 생성자 호출!");
    }
    /*run(): 달리는 기능, soundHorn() : 경적을 울리는 기능
    * isRunning() : 주행 상태를 반환하는 기능
    * stop() : 멈추는기능
    * */

    public void run(){
        runningStatus =true;
        System.out.println("자동차가 뛴다!!!!!!");
    }

    public void soundHorn(){

        // 자동차는 주행중이 상태일 때만 경적을 울릴 수 있다.
        if(isRunning()){
            System.out.println("turn on the B! ");

        }else {
            System.out.println("멈춰 있어서 경적울리면 민폐야 이자식아");
        }

    }

    //protected 접근 제한자로 같은 패키지 내에 있는 클래스
    //private 교체하게 된다면 ?
//    private boolean isRunning(){

     protected boolean isRunning(){

        //주행 상태를 반환하는 기능
        return runningStatus;
    }

    public void stop(){
        runningStatus= false;
        System.out.println("자동차가 시동을 멈춥니다.");
    }



}
