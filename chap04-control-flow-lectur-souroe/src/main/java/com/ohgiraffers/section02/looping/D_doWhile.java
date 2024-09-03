package com.ohgiraffers.section02.looping;

public class D_doWhile {
    public void testDoWhileStatement(){

        /* 수업목표 do-while 문 단독 사용에 대해 이해할 수 있다.*/

        /*필기
        * [do-while 문 표현식]
        * 초기식;
        * do{
        *     1회차에는 무조건 실행하고, 이후는 조건식을 확인해서
        *     조건을 만족하는 경우에만 박복 할 구문;
        *     증감식;
        * }while (조건식)
        * */

        do{
            System.out.println("최초 한번 작동함");
        }while(false);
        System.out.println("반복문 종료 확인");


    }
}
