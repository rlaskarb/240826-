package com.ohgiraffers.section05.typecastiong;

public class skillstest {
    public static void main(String[] args) {

        /*국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
         총점과 평균을 정수 형태로 출력하세요.*/

        double language = 80.5;
        double maths = 50.6;
        double english = 70.8;

        /*-- 출력 예시 --
             총점 : 201
             평균 : 67
             */

        System.out.println("총점 = " + (int) (language + maths + english) );
        System.out.println("평균 = " + (int)(language + maths + english)/3 );







    }
}
