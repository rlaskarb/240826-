package com.ohgiraffers.section01.Ex;

public class FireCar1 extends Car1{
    /*목차 1. extends 키워드를 통해 Car1 클래스 상속*/
    //기본생성자
    public FireCar1() {

        /*필기
        * 모든 생성자에는 가장 첫 줄에 super()를 컴파일러가 자동 추가 해준다.
        * super() -> 부모의 기본 ㅅ갱성자를 호출하는 구문이다.
        * 명시적,묵시적 둘다 가능하다.
        * */
        super();
        System.out.println("FrieCar1 클래스의 기본생성자 호출");
    }
    /*목차 2.  soundHorn() 메소드 오버라이딩 */




    @Override
    public void soundHorn() {
       if(isRunning()){
           System.out.println("길을 비키시오");
       }else{
           System.out.println("경적을 울리지 않겠다.");
       }
    }
    /*물대포 설치*/
    public void speatWater(){
        System.out.println("물대포 서얼치 완료!");
    }

}
