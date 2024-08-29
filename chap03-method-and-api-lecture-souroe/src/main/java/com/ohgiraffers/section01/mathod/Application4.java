package com.ohgiraffers.section01.mathod;

public class Application4 {
    public static void main(String[] args) {

        /*수업목표 여러 개의 전달 인자를 이용한 메소드 호출 테스트*/

        /* 목차 2 여러 개 매개변수를 가진 메소드 호출하기.*/

        Application4 app2 = new Application4();
        app2.testArgsMethod("김남규",36,'남');

//        app2.testArgsMethod("김남규","36",'남'); //값의 갯수는 맞지만, 순서가 다르게 전달되면 안된다.?

        String name = "김남규";
        int age = 20;
        char gender = '남';

        app2.testArgsMethod(name,age,gender);




    }

    /* 목차 1 여려 개 전달인자를 받을 수 있는 메소드 만들기. */
    public void testArgsMethod(String name, int age, final char gender) {

        /*필기
        * 매개변수도 일종의 지역변수로 분류 된다.
        * 매개변서 역시 상수의 의미를 가지는 final 키워드를 사용할 수 있다.
        * (지역변수에 final 키워드를 붙이는 것과 동일하다.)
        *  */

        System.out.println("내 이름은 " + name + " 이고, 나이는" +age + "세 이며, 성별은 " + gender + "입니다.");




    }




}
