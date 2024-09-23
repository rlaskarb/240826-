package com.ohgiraffers.section01.mathod;

public class Calculator {
    /*필기
    * 우리는 Application 에서 2개의 정수를 전달 할 것이고
    * Calculator 클래스는 2개의 정수를 전달 받아
    * 최소값을 구하는 메소드(기능)
    * 최대값을 구하는 메소드(기능)
    *실행 후 Application 에게 2개의 정수 중 큰 값고 장은 값이
    * 무엇인 지 알려 줄것이다
    *  */

    public int minNumberof(int first, int second) {
        return (first < second) ? first : second;

    }

    public static int maxNumberof(int first, int second) {
        return (first > second) ? first : second;
    }

}
