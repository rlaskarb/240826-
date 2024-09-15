package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    /*목차 1. extends 키워드를 통해 Car 클래스 상속 */
    // 기본생성자
    public FireCar(){

        /*필기
        * 모든 생성자에는 가장 첫 줄에 super() 를 컴파일러가 자동 추가 해준다.
        * super() -> 부모의 기본 생성자를 호출하는 구문이다.
        * 명시적,묵시적 둘다 가능하다.
        * */
        super();

        System.out.println("FireCar 클래스의 기본 생성자 호출됨!");
    }

    /*목차 2.soundHorn() 메소드 오버라이딩*/

    @Override
    public void soundHorn() {

        if(isRunning()){
            System.out.println("야이거 방탄유리야 새퀴들아 뒤지기 싫으면 비켜!!!!!!!");
        }else{
            System.out.println("가만히 있어 주겠다!");
        }

    }
    /* 꼬부기 매달아 놓기 */
    public void speatWater(){
        System.out.println(" 가라 몸통 박치기!");
    }

}
