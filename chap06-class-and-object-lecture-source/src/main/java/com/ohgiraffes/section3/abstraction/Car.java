package com.ohgiraffes.section3.abstraction;

public class Car {

    // 관리 해야 할 상태 속력, 시동상태
    private boolean isOn; // 시동상태
    private int speed; // 현재속력

    public void starUp() {
        if(isOn){
            System.out.println("이미 시동 걸렸음 ㅅㄱ 대기하셈 ㅋㅋ.");
        }else{
            this.isOn = true;
            System.out.println("시동을 건드아~!!!");
        }
    }

    public void go() {
        if(isOn){
            System.out.println("가즈아~!!");
            this.speed += 10;
            System.out.println("시속이 : "+ this.speed +" km/h 임");
        }
    }

    public void stop() {
        //시동이 걸려있고, 달리는 상태인 경우에만 멈출 수 있다.
        if(isOn){
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이쿠! ");
            }else{
                System.out.println("멈춰 있는데 왜????");

            }

        }

    }
// 시동이 걸려있다면 시동을 끄고, 이미꺼져있다면 끌 수 없고, 움지고 있다면 브레이크를 먼저
    public void turnOff() {
        if(isOn){
            if(this.speed>0){
                System.out.println("지금 달리고 있는데 너 디바 궁 쓸려고?");
            }else{
                this.isOn = false;
                System.out.println("끌께!");
            }
    }else {
            System.out.println("껏어");
        }
        }
}
