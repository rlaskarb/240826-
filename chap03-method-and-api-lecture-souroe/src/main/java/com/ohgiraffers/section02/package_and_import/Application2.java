package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.mathod.Calculator;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표 임포트에 대해 이해할 수 있다.*/
        /*필기
        * import 란?
        * 서도 다른 패키지에 존재하는 클래스를 사용하는 경우
        * 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        * 하지만 매번 다른 클래스의 풀 패키지명을 쓰기에는 너무 번거롭다.
        * 그래서 패키지명을 생략하고 사용할수 있도록 한 구문이 import 이다.
        * import 는 package 선언문과 class 선언문 사이에 작성하게 되며
        * 어떠한 패키지 내에 있는 클래스를 사용할 것인지 대해 미리선언하는 효과를 갖게 된다.
        * */
        Calculator calc = new Calculator();



        /* non -static 메소드 호출*/
        int min = calc.minNumberof(50,60);
        System.out.println("50과 60중 더 작은 값 : " + min);
        /* 출력예시 : 50과 60중더 작은 값은 50*/

        /* static 메소드 호출*/
        int max = Calculator.maxNumberof(50,60);
        System.out.println("50과 60중 더 큰 값 : " +max);
        /* 출력예시: 50과 60중 더 큰 값은 60*/





    }


}
