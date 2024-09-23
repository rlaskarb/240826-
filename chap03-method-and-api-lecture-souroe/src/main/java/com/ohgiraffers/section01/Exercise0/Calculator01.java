package com.ohgiraffers.section01.Exercise0;

public class Calculator01 {


        /* 다음 조건을 만족하는 프로그램을 작성하시오.
         *   구현 클래스 Calculator, Application01
         *   구현 내용
         *   Calculator
         *   - checkMethod(): void 설명 : 함수 호출, 확인용 메소드
         *   - sumTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 합을 리턴한다.
         *   - minusTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 차를 리턴한다.
         *   - multiTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 곱한 값을 리턴한다.
         *   - divideTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 나눈 값을 리턴한다.
         */


    public void checkMethod(){

        System.out.println("시작");

        int first = 10;
        int second = 20;
        int trird = 5;

        Calculator01 a1 = new Calculator01();
        a1.sumTowNumber(first,second);
        a1.minusTwoNumber(first,trird);
        a1.multiTwoNumber(first,trird);
        a1.divideTowNumber(first,trird);

        System.out.println("10과 20의 합 :" + a1.sumTowNumber(first,second));
        System.out.println("10과 5의 차 :" + a1.minusTwoNumber(first,trird));
        System.out.println("10과 5의 곱 :" + a1.multiTwoNumber(first,trird));
        System.out.println("10과 5의 나눈 후 몫 :" +a1.divideTowNumber(first,trird));

        System.out.println("종료");
    }


    public int sumTowNumber(int first,int second){

        return first+second;
    }

    public int minusTwoNumber(int first,int second){
        return first-second;
    }

    public int multiTwoNumber(int first,int second){
        return first*second;
    }

    public int divideTowNumber(int first,int second){
        return first/second;
    }
}
